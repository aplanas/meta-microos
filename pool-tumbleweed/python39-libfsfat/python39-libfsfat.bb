SUMMARY = "Library and tools for accessing the FAT filesystem"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "python39-libfsfat-20220925-4.2.aarch64.rpm"
RPM_HASH = "edc64e77d2ae477793291e52c2f743f236c8e9e202ceb81bbad214e4ac24037457f157005b7afe0cd12110f71887312735ec0a5a8e0477c27776cf68d18e8fb8"

RPROVIDES:${PN} += "python39-libfsfat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsfat.so.1 \
python-abi"

inherit rpm
