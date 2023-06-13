SUMMARY = "Well designed C++ sqlite 3.x wrapper library"
DESCRIPTION = "VSQLite++ is a C++ wrapper for sqlite3 using the C++ standard library and boost. \
VSQLite++ is designed to be easy to use and focuses on simplicity."
LICENSE = "BSD-3-Clause"

PV = "0.3.13"

RPM_NAME = "libvsqlitepp3-0.3.13-4.10.aarch64.rpm"
RPM_HASH = "eb90cf3e0f1c19ba4babec1029a3d1d8a5e84b50cd7fc54b1b1b5b0361eaabfeab01cd8e3acf71f34598acd55637302164ae24a059e01601d35645d7a5820d96"

RPROVIDES:${PN} += "libvsqlitepp.so.3()(64bit) \
libvsqlitepp3 \
libvsqlitepp3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libsqlite3.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
