SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rpi4-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "6c4e5ee438f90faaa274b5759499f00d1856d0e84bb642bcce88d4dbe5b6818e02105f4c2a49d033e5f3ea2baf096a95289341e9786dbc3123d0021394d14067"

RPROVIDES:${PN} += "u-boot-rpi4-doc"

RDEPENDS:${PN} += ""

inherit rpm
