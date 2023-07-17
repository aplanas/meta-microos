SUMMARY = "Library and tools for accessing the SGI X File System (XFS)"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "python310-libfsxfs-20220829-3.11.aarch64.rpm"
RPM_HASH = "5f4fba8c6deb4d5801e69a5151035bdb2af65466e395ba7c6042a3e79607e4bea8ae03bce6fd7d97ef23a632353abf48ff86e080e9de1403c5edbc7abf85324d"

RPROVIDES:${PN} += "python310-libfsxfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsxfs.so.1 \
python-abi"

inherit rpm
