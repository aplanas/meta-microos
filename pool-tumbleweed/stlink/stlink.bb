SUMMARY = "STM32 discovery line linux programmer"
DESCRIPTION = "STLINK v1/v2 JTAG/SWD debugging/flashing tool for STM32 microcontrollers."
LICENSE = "BSD-3-Clause"

PV = "1.7.0"

RPM_NAME = "stlink-1.7.0-2.8.aarch64.rpm"
RPM_HASH = "7cae2a48c6ace203c8e697eacddb6b263517e515d0ef14706c2f712fde636dd4722d292b58e0679220020c1eafad5246d954300dbe21342e54a7ccb28e1231f4"

RPROVIDES:${PN} += "stlink"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libstlink.so.1 \
udev"

inherit rpm
