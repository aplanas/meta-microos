SUMMARY = "Library and tools for accessing the SGI X File System (XFS)"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "python311-libfsxfs-20220829-3.11.aarch64.rpm"
RPM_HASH = "3003d378ab7dbf52a43e57cc7c0bfb105bbaac894625338d240f2771a8fa57339e171f83990dec0a652eb1058f11dff29a2d2f20b04c43ce61549d649738a547"

RPROVIDES:${PN} += "python3-libfsxfs \
python311-libfsxfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsxfs.so.1 \
python-abi"

inherit rpm
