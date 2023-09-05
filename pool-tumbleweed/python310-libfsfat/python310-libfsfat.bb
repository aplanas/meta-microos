SUMMARY = "Library and tools for accessing the FAT filesystem"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "python310-libfsfat-20220925-4.2.aarch64.rpm"
RPM_HASH = "93244f176592011ee8c33b1819e6b77dd604cf192998c4ea1bbfac8820a0fb6990641e0e5868b7f35a3ad2c5abe612a43057bfcbcd66d23c036849907c08e1b1"

RPROVIDES:${PN} += "python310-libfsfat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsfat.so.1 \
python-abi"

inherit rpm
