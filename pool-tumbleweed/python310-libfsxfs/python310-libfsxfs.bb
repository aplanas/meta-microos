SUMMARY = "Library and tools for accessing the SGI X File System (XFS)"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "python310-libfsxfs-20220829-3.10.aarch64.rpm"
RPM_HASH = "cb5e0e21ae2123b2bc80489c2b5fd3c13ad37bde8953203333dae5c246ce2b5c00913631e8c4730584ff0e6c73a367c7fc8c9ab153a0795fdb7068fff8f7f1a8"

RPROVIDES:${PN} += "python310-libfsxfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsxfs.so.1 \
python-abi"

inherit rpm
