SUMMARY = "The U-Boot firmware for the khadas-vim platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the khadas-vim platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-khadas-vim-2023.04-2.1.aarch64.rpm"
RPM_HASH = "de29488f67e1c399267160a2867fa03feae3b48866693598a57b9a65728f2a4ea2c98391ba242511effc52251371fac0b5012d7cc08ac964d7724ecfdc11e4c6"

RPROVIDES:${PN} += "u-boot-khadas-vim \
u-boot-khadas-vim(aarch-64) \
u-boot-loader"
RDEPENDS:${PN} += ""

inherit rpm
