SUMMARY = "Library and tools for accessing the FAT filesystem"
DESCRIPTION = "libfsfat is a library to access the File Allocation Table (FAT) file \
system format. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220925"

RPM_NAME = "python310-libfsfat-20220925-3.9.aarch64.rpm"
RPM_HASH = "0b6738b95dd3f0455b8011e3e8b9cb3123ab9ae452901b483c25e93a780f715e812e4228774a86fd179caa3cbe59fffc0ec7daa3a59c178386d78359c93d9267"

RPROVIDES:${PN} += "python3-libfsfat \
python310-libfsfat \
python310-libfsfat(aarch-64)"
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