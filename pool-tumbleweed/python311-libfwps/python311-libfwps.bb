SUMMARY = "Library for Windows Property Store data types"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20230202"

RPM_NAME = "python311-libfwps-20230202-1.4.aarch64.rpm"
RPM_HASH = "e7db91f2d700471ec02ef943e629eb8425c253c20875d60ae61b9ea391c43cbfcc9f18b79f9046beb15bf35b0248baf101d5c5d293f3ba5fdd1df42768787036"

RPROVIDES:${PN} += "python311-libfwps \
python311-libfwps(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libfwps.so.1()(64bit) \
libfwps.so.1(V_20230202)(64bit) \
python(abi)"

inherit rpm
