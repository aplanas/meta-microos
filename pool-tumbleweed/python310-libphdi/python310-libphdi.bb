SUMMARY = "Library and tools to access the Parallels Hard Disk images"
DESCRIPTION = "libphdi is a library to access the Parallels Hard Disk image format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221025"

RPM_NAME = "python310-libphdi-20221025-3.8.aarch64.rpm"
RPM_HASH = "430bdc5b4ed760843aab8e3afe1a83827036b49d2be3ca09ca64d3d60820d2e3aba85361ede2cb0ca6d5deab63bb18790c86d9ea2d4378bf85ec785d1620329d"

RPROVIDES:${PN} += "python3-libphdi \
python310-libphdi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libphdi.so.1 \
python-abi"

inherit rpm
