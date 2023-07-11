SUMMARY = "Library and tools for accessing the FAT filesystem"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "python311-libfsfat-20220925-3.11.aarch64.rpm"
RPM_HASH = "58be9d020ea36d877eb54c0bc26c05b919f489ffea61db15152dcd704a87a0a0cf6a5ad6812bbeb011d0825c7f06af7610cb7fd090f73fcfc604a7671e903d76"

RPROVIDES:${PN} += "python3-libfsfat \
python311-libfsfat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsfat.so.1 \
python-abi"

inherit rpm
