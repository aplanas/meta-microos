SUMMARY = "GPRS tunnel configuration library"
DESCRIPTION = "libgtpnl wraps the genetlink-based GPRS tunnel configuration of the \
Linux kernel into a C API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.3"

RPM_NAME = "libgtpnl0-1.2.3-1.3.aarch64.rpm"
RPM_HASH = "16f60e08941b43f4e52365314a0fe02b1300b3b706747499130207d34bc05e06c06d9d77fb4a41a688fba93e2b87c07f028e35af9094cdf13812b4db636146a2"

RPROVIDES:${PN} += "libgtpnl.so.0()(64bit) \
libgtpnl.so.0(LIBGTPNL_1.0)(64bit) \
libgtpnl0 \
libgtpnl0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libmnl.so.0()(64bit) \
libmnl.so.0(LIBMNL_1.0)(64bit)"

inherit rpm
