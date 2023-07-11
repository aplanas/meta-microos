SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-ls1012afrdmqspi-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "9d35bb8bb0b1def6c8f733125198c54b83c7618a9ebba036200d0ca032fe3d5b97a0a9abf2b118ce24db60822504636fe36a7ddeda7d28ed8a2e92baf74c4887"

RPROVIDES:${PN} += "u-boot-ls1012afrdmqspi-doc"

RDEPENDS:${PN} += ""

inherit rpm
