SUMMARY = "Library for Windows Property Store data types"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20230711"

RPM_NAME = "libfwps1-20230711-2.1.aarch64.rpm"
RPM_HASH = "7e0361c45ed230a3788506a6ef2c9c50a2fa443c9a710ef156b181018a46fd0a02e2e099a7e7dc9ff93fd6d7c3dc7c946d4750c04a244e5102b120896767d33a"

RPROVIDES:${PN} += "libfwps.so.1 \
libfwps1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libuna.so.1"

inherit rpm
