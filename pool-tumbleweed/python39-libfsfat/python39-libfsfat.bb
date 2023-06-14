SUMMARY = "Library and tools for accessing the FAT filesystem"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "python39-libfsfat-20220925-3.9.aarch64.rpm"
RPM_HASH = "dd9f7546fc6386abbd9304a014cd7423c01593408e14868736a41619be0147de79175e1bfc91e70242c72a524803cc16dace5e551b8bc02b8487e55aed603ccd"

RPROVIDES:${PN} += "python39-libfsfat"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libfsfat.so.1 \
python-abi"

inherit rpm
