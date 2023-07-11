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

RPM_NAME = "stm32flash-0.7-1.4.aarch64.rpm"
RPM_HASH = "2591ddf0717e50a3938eb89a2d24c345d8e9f73dfe25229e51116a29484b382eaf42aad0f187eec56dd33baddeecffd142c0487b198961ab2970c3e3b1d27845"

RPROVIDES:${PN} += "stm32flash"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
