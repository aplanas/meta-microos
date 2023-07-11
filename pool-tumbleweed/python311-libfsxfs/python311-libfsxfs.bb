SUMMARY = "Library and tools for accessing the SGI X File System (XFS)"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "python311-libfsxfs-20220829-3.10.aarch64.rpm"
RPM_HASH = "e3a63761ae6db9c3d96b67654c0905cf6e60cb18dbd894ebbf5074c92e158b1e1feb4ac03c13a55dbde5ecc9beb4dafcd2348b5018658c3afd0801da259cf2cf"

RPROVIDES:${PN} += "python3-libfsxfs \
python311-libfsxfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsxfs.so.1 \
python-abi"

inherit rpm
