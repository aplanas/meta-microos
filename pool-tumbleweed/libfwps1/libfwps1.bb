SUMMARY = "Library for Windows Property Store data types"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20230202"

RPM_NAME = "libfwps1-20230202-1.7.aarch64.rpm"
RPM_HASH = "ac6a82371cd4734947c71a951b1313d5db7571b1c1c489a187069d96b35c33fc21256848bae41c22613fcdda94d8add8b18fb89201533c28d919bdb5a2fc3fb8"

RPROVIDES:${PN} += "libfwps.so.1 \
libfwps1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libuna.so.1"

inherit rpm
