SUMMARY = "The U-Boot firmware for the pinebook-pro-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the pinebook-pro-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-pinebook-pro-rk3399-2023.04-2.2.aarch64.rpm"
RPM_HASH = "597e30770b09e3accc2b06413a40277bf7fd43890bb3abc7628c57e45733d87e85279d20e356e45dba907c72dd6020d8ecceed14063b0c9c9f042033386e6742"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-pinebook-pro-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
