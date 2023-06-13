SUMMARY = "HashLink library"
DESCRIPTION = "This subpackage provides the libhl library for HashLink."
LICENSE = "MIT"

PV = "1.13"

RPM_NAME = "libhl1-1.13-1.3.aarch64.rpm"
RPM_HASH = "20322bf2af94aecdf3487dad5bddb6f3951eac057a7f511d2f64ce89eeb501e0bc018d42dba6205a860f604d1f281d515e17e69e1a7e4b26fb84c694de8393a6"

RPROVIDES:${PN} += "libhl.so.1()(64bit) \
libhl1 \
libhl1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
