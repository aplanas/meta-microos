SUMMARY = "The U-Boot firmware for the khadas-vim platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the khadas-vim platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-khadas-vim-2023.04-2.2.aarch64.rpm"
RPM_HASH = "f53496ffb22eeaaf3470f1dacc788be04f49702158cd1896aff667662da5a7072395992742147b69b8b92e3cc1ac1e76be94a0194ef072a844fa36ebbf678ab2"

RPROVIDES:${PN} += "u-boot-khadas-vim \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
