SUMMARY = "GPRS tunnel configuration library"
DESCRIPTION = "libgtpnl wraps the genetlink-based GPRS tunnel configuration of the \
Linux kernel into a C API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.2.4"

RPM_NAME = "libgtpnl0-1.2.4-1.1.aarch64.rpm"
RPM_HASH = "714150e4c94166995c8a6779b18e66a8ef43382187f3765c7e1f27cd0a2e18f350fdb8f6f3fdfa578137745b8a72564785ad12790ae916fd0fba6ec0d4671d0d"

RPROVIDES:${PN} += "libgtpnl.so.0 \
libgtpnl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmnl.so.0"

inherit rpm
