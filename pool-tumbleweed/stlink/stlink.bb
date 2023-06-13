SUMMARY = "STM32 discovery line linux programmer"
DESCRIPTION = "STLINK v1/v2 JTAG/SWD debugging/flashing tool for STM32 microcontrollers."
LICENSE = "BSD-3-Clause"

PV = "1.7.0"

RPM_NAME = "stlink-1.7.0-2.7.aarch64.rpm"
RPM_HASH = "8e21dde7f4731fb48a99e703044faa48db53279e188c9fd50ed9cf765f08516410601f64ea8ac3e75c86ceadd703841c35ecaeaae474550cc07b98ae0ad1458a"

RPROVIDES:${PN} += "stlink \
stlink(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libstlink.so.1()(64bit) \
udev"

inherit rpm
