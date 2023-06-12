SUMMARY = "Library and tools to access the Mac OS disk image formats"
DESCRIPTION = "libmodi is a library to access the Mac OS disk image formats. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "python310-libmodi-20221023-3.7.aarch64.rpm"
RPM_HASH = "f8fad1567736854d93ab8b0ee4383fbd2541c78bc4ea6e096969e8247a3c04643843c9482b7cf73d50a3ea4cd2c4be70c63194d58d3582bca86206068af23856"

RPROVIDES:${PN} += "python3-libmodi \
python310-libmodi \
python310-libmodi(aarch-64)"
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
