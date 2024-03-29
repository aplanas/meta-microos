SUMMARY = "Library and tools for accessing the SGI X File System (XFS)"
DESCRIPTION = "libfsxfs is a library to access the SGI X File System (XFS). \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220829"

RPM_NAME = "python39-libfsxfs-20220829-4.1.aarch64.rpm"
RPM_HASH = "ba546a861003335a3398cb9664d7845d2a6f8d547fdf94e5f94dfbde19ca9b4a0414a65118d3b9161a123b8a9ddac484dd629f768dab3ab1110ac34c8672dd04"

RPROVIDES:${PN} += "python39-libfsxfs"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsxfs.so.1 \
python-abi"

inherit rpm
