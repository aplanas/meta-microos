SUMMARY = "Library and tools for accessing the SGI X File System (XFS)"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "python310-libfsxfs-20220829-4.1.aarch64.rpm"
RPM_HASH = "6510e8f80c56e30cbd43577476b28d78ed024971ed089d72fee31060f8d8cd7f6d2d7c2cf86356158237335e5e45e85e0a53bc6d292d7ca767f3947e7c5048ef"

RPROVIDES:${PN} += "python310-libfsxfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsxfs.so.1 \
python-abi"

inherit rpm
