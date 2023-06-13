SUMMARY = "Library and tools to access the Mac OS disk image formats"
DESCRIPTION = "libmodi is a library to access the Mac OS disk image formats. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "python311-libmodi-20221023-3.7.aarch64.rpm"
RPM_HASH = "197b623c61a8df52c730b1c60e806046815329b10c1b74583a387ec6680136ee93401bfb76ffcbc3fea9d557d24849d03568fb862221d6aa408a696157132ca3"

RPROVIDES:${PN} += "python311-libmodi \
python311-libmodi(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libmodi.so.1()(64bit) \
libmodi.so.1(V_20221023)(64bit) \
python(abi)"

inherit rpm
