SUMMARY = "Library and tools for accessing the FAT filesystem"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "python39-libfsfat-20220925-3.12.aarch64.rpm"
RPM_HASH = "41f12c2a0e8cc90cb96b99518d11b56eeff802de2bb68a28f2982e829c07298667aa94717e9d70f481d6b083402efdda458a7dc7e5b29e4a4b77bcd5628c4dbf"

RPROVIDES:${PN} += "python39-libfsfat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsfat.so.1 \
python-abi"

inherit rpm
