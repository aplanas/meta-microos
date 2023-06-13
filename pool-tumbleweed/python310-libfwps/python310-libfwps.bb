SUMMARY = "Library for Windows Property Store data types"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20230202"

RPM_NAME = "python310-libfwps-20230202-1.4.aarch64.rpm"
RPM_HASH = "8b6d396560bb61e772bc45e56e01f332603db931f644986f22334d0f9f01d695188c47b16a896573867c4dda0c22df380566291e57381bad1da5ff9b901acc85"

RPROVIDES:${PN} += "python3-libfwps \
python310-libfwps \
python310-libfwps(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libfwps.so.1()(64bit) \
libfwps.so.1(V_20230202)(64bit) \
python(abi)"

inherit rpm
