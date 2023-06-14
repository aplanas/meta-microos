SUMMARY = "SQLite support for the Courier authentication library"
DESCRIPTION = "This package installs SQLite support for the Courier authentication \
library. Install this package in order to be able to authenticate using \
SQLite."
LICENSE = "SUSE-GPL-3.0-with-openssl-exception"

PV = "0.72.0"

RPM_NAME = "courier-authlib-sqlite-0.72.0-1.4.aarch64.rpm"
RPM_HASH = "f40a8b21f4b97475e40ccd9f734dc801bba68618bc1bd1be51af511479f532d280a1312299f036ef118a37af589b23de9785995bac4065f48a9b54872b2475c0"

RPROVIDES:${PN} += "courier-authlib-sqlite \
libauthsqlite.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcourierauth.so.0 \
libcourierauthcommon.so.0 \
libgcc-s.so.1 \
libsqlite3.so.0 \
libstdc++.so.6"

inherit rpm
