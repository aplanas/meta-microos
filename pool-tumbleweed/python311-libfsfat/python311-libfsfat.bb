SUMMARY = "Library and tools for accessing the FAT filesystem"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "python311-libfsfat-20220925-4.2.aarch64.rpm"
RPM_HASH = "103d4729c8c37ea59028fe5163b0530f669ff559617690b536ee78194dda1ff9e65a12d5c14acabf317aa4ade8e7e9c96305d1530810a9c8dcd7366e39483150"

RPROVIDES:${PN} += "python3-libfsfat \
python311-libfsfat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsfat.so.1 \
python-abi"

inherit rpm
