SUMMARY = "The U-Boot firmware for the rock-pi-4-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rock-pi-4-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rock-pi-4-rk3399-2023.04-2.1.aarch64.rpm"
RPM_HASH = "606a28056461068881405ebd82c51e6aab16211c0fb5c1e0b8dc99e36be5e40a15f665767c9487bc0502b2f359600b2868d8aa35f612344484d295ca0e3b5eb4"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rock-pi-4-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
