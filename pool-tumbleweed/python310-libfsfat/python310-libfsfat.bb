SUMMARY = "Library and tools for accessing the FAT filesystem"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "python310-libfsfat-20220925-3.12.aarch64.rpm"
RPM_HASH = "cc526655a71b02c747a56b1d5a19b409ef598fb5d0ca79f14cb1ab178828d30dba6628c3f37427cee62ec58dc05f2afce091e80e3fac57596720a2be0be24d97"

RPROVIDES:${PN} += "python310-libfsfat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsfat.so.1 \
python-abi"

inherit rpm
