SUMMARY = "Library and tools for accessing the SGI X File System (XFS)"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "python311-libfsxfs-20220829-4.1.aarch64.rpm"
RPM_HASH = "6daa89129b7b35fa094bfb48aea83ccf48fa3102933a4ee126ade326f94126fa87fb572465765c49c8eb142476c8c3a8761c091b5e70f7fd5417ec3a3bd927bf"

RPROVIDES:${PN} += "python3-libfsxfs \
python311-libfsxfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsxfs.so.1 \
python-abi"

inherit rpm
