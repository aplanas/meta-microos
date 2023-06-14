SUMMARY = "GPRS tunnel configuration library"
DESCRIPTION = "libgtpnl wraps the genetlink-based GPRS tunnel configuration of the \
Linux kernel into a C API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.3"

RPM_NAME = "libgtpnl0-1.2.3-1.3.aarch64.rpm"
RPM_HASH = "16f60e08941b43f4e52365314a0fe02b1300b3b706747499130207d34bc05e06c06d9d77fb4a41a688fba93e2b87c07f028e35af9094cdf13812b4db636146a2"

RPROVIDES:${PN} += "libgtpnl.so.0 \
libgtpnl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0"

inherit rpm
