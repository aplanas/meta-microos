SUMMARY = "Shared library for stlink"
DESCRIPTION = "STLINK v1/v2 JTAG/SWD debugging/flashing tool for STM32 microcontrollers."
LICENSE = "BSD-3-Clause"

PV = "1.7.0"

RPM_NAME = "libstlink1-1.7.0-2.8.aarch64.rpm"
RPM_HASH = "17e6eee942e2ae7ba6307b1a07fa434a5c39292d623c321a88977dc06929be3fca5d2e831d74e496bae7415ff394cad5ffd22ad68d1ff9c69ce0ad8072687c64"

RPROVIDES:${PN} += "libstlink.so.1 \
libstlink1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
