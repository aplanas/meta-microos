SUMMARY = "Library and tools for accessing the SGI X File System (XFS)"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "python39-libfsxfs-20220829-3.10.aarch64.rpm"
RPM_HASH = "d8795f03d133c4275c5ca41fb949ebd7ef64ebbe09ad7e7e4a1568489933d1c94b9d0f70f6b5314289edddbdf3cd5ee698e1c3fd8b841b3a5b75d012e6086f3f"

RPROVIDES:${PN} += "python39-libfsxfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsxfs.so.1 \
python-abi"

inherit rpm
