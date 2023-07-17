SUMMARY = "Library for Windows Property Store data types"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20230711"

RPM_NAME = "libfwps1-20230711-1.1.aarch64.rpm"
RPM_HASH = "87411d84c28b675bda39afe4c356dbaa8aee292f29c52a5b254df63f532d59895b3670969edc7af919e2089798ff6acea269c49cb873615d4dfb92750b28ea1a"

RPROVIDES:${PN} += "libfwps.so.1 \
libfwps1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libuna.so.1"

inherit rpm
