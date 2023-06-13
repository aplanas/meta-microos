SUMMARY = "Library of utility functions shared between sfcb and sfcc"
DESCRIPTION = "This package provides a common library for functions \
shared between sfcb and sfcc."
LICENSE = "EPL-1.0"

PV = "1.0.1"

RPM_NAME = "libsfcUtil0-1.0.1-3.24.aarch64.rpm"
RPM_HASH = "1344835e40915a54b9a00c15db7e82d4f6a59395dbff1a5551d91997fee69d701fcc8d70b562a50992c523f8a6af00e5d2dded5403f0a6f7fe8da8f1b1538e30"

RPROVIDES:${PN} += "libsfcUtil.so.0()(64bit) \
libsfcUtil.so.0(SFCUTIL_1.0)(64bit) \
libsfcUtil.so.0(SFCUTIL_1.1)(64bit) \
libsfcUtil0 \
libsfcUtil0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
