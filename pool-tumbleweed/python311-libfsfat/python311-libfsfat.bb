SUMMARY = "Library and tools for accessing the FAT filesystem"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "python311-libfsfat-20220925-3.12.aarch64.rpm"
RPM_HASH = "c43a2c6051d7bb5223c615e4c7efea1b343b67fc34d86255a09f0bde12dd6e3f336fc517ab0c45da051157550b1e0105e2260cb18a737941ef8a6fa3f1160bc1"

RPROVIDES:${PN} += "python3-libfsfat \
python311-libfsfat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsfat.so.1 \
python-abi"

inherit rpm
