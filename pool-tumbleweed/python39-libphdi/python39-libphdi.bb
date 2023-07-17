SUMMARY = "Library and tools to access the Parallels Hard Disk images"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python39-libphdi-20221025-3.12.aarch64.rpm"
RPM_HASH = "0d11b5c57f884abb62210f179c84bef292320b7ef263613d0f0a7c38d36099a546cb68c5210db61f63b2fdaade07984088ea0dfc90c39cbaaba68dc26f360a38"

RPROVIDES:${PN} += "python39-libphdi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libphdi.so.1 \
python-abi"

inherit rpm
