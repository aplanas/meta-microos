SUMMARY = "Library and tools for accessing the FAT filesystem"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "python39-libfsfat-20220925-3.11.aarch64.rpm"
RPM_HASH = "ee862ed408e494083ce4c71f95867b5813c58b2b74cb42f1c604816b362ca928eb2fb9943875f7406b09a1b0e193a2cfdaf598854d1e6e597b67aab43092eba8"

RPROVIDES:${PN} += "python39-libfsfat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsfat.so.1 \
python-abi"

inherit rpm
