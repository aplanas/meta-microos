SUMMARY = "Library and tools for accessing the FAT filesystem"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "python310-libfsfat-20220925-3.11.aarch64.rpm"
RPM_HASH = "b4ac4a824ef9ac01ef81997523e9df088c958d048794f30ed52caa7b898a3202f0b0cdf538e36539dda4b5b9a88424b95fe0e3b688d99fe392945c963a98b7af"

RPROVIDES:${PN} += "python310-libfsfat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsfat.so.1 \
python-abi"

inherit rpm
