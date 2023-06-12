SUMMARY = "Flash Program for the STM32 Bootloader"
DESCRIPTION = "Open source flash program for the STM32 ARM processors using the ST \
serial bootloader over UART or I2C. \
 \
Features: \
- UART and I2C transports supported \
- device identification \
- write to flash/ram \
- read from flash/ram \
- auto-detect Intel HEX or raw binary input format with option to force \
  binary \
- flash from binary file \
- save flash to binary file \
- verify & retry up to N times on failed writes \
- start execution at specified address \
- software reset the device when finished if -R is specified \
- resume already initialized connection (for when reset fails, UART only) \
- GPIO signalling to enter bootloader mode (hardware dependent)"
LICENSE = "GPL-2.0-or-later"

PV = "0.7"

RPM_NAME = "stm32flash-0.7-1.3.aarch64.rpm"
RPM_HASH = "fcf85c99426f8d0b59bd0606c4de5ce98ed614e1c1ce998ca5e812ce4269768184b33458944c9da9a9725c5ec38be7c39852c3639d15b3b227b2f401a341d308"

RPROVIDES:${PN} += "stm32flash \
stm32flash(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
