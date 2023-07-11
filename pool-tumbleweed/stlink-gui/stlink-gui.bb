SUMMARY = "GUI for STM32 discovery line linux programmer"
DESCRIPTION = "STLINK v1/v2 JTAG/SWD debugging/flashing tool for STM32 microcontrollers."
LICENSE = "BSD-3-Clause"

PV = "1.7.0"

RPM_NAME = "stlink-gui-1.7.0-2.8.aarch64.rpm"
RPM_HASH = "63bb54207529cf8de8c9d405f11af23f2d4d2f08de82e79697b4b57ef96bf9eab5916ff98eeb1d74dc3b5d6bc97c06bb78f72c1ac6a4a5a646837b508052f476"

RPROVIDES:${PN} += "stlink-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libstlink.so.1 \
stlink"

inherit rpm
