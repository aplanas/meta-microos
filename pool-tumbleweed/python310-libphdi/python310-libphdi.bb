SUMMARY = "Library and tools to access the Parallels Hard Disk images"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python310-libphdi-20221025-3.12.aarch64.rpm"
RPM_HASH = "cc4cbe11c5f633f5ba133e6f3ed1f55dad95d3ba694587776565f7a9d250ff249553e1182688bd99dcd2248b6258b8eea63b0553f5e480530e090c9a25ff8775"

RPROVIDES:${PN} += "python310-libphdi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libphdi.so.1 \
python-abi"

inherit rpm
