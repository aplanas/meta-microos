SUMMARY = "SQLite support for the Courier authentication library"
DESCRIPTION = "This package installs SQLite support for the Courier authentication \
library. Install this package in order to be able to authenticate using \
SQLite."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "0.72.0"

RPM_NAME = "courier-authlib-sqlite-0.72.0-1.4.aarch64.rpm"
RPM_HASH = "f40a8b21f4b97475e40ccd9f734dc801bba68618bc1bd1be51af511479f532d280a1312299f036ef118a37af589b23de9785995bac4065f48a9b54872b2475c0"

RPROVIDES:${PN} += "courier-authlib-sqlite courier-authlib-sqlite(aarch-64) libauthsqlite.so.0()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcourierauth.so.0()(64bit) libcourierauthcommon.so.0()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libsqlite3.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
