SUMMARY = "Library and tools for accessing the FAT filesystem"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "python311-libfsfat-20220925-3.9.aarch64.rpm"
RPM_HASH = "f00e57a4e2fbe45ff79fd9c0be2cd2cc21f49507c4743ccfb3c1b6f50c67af4dda8ccdaedff0cedd187a2a35e198aa0d7ca63a83fcc0797cf58bb7cbe1672744"

RPROVIDES:${PN} += "python311-libfsfat \
python311-libfsfat(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libfsfat.so.1()(64bit) \
libfsfat.so.1(V_20220925)(64bit) \
python(abi)"

inherit rpm
