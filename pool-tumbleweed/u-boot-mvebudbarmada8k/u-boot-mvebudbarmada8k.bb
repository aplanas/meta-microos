SUMMARY = "The U-Boot firmware for the mvebudbarmada8k platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the mvebudbarmada8k platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-mvebudbarmada8k-2023.07-1.1.aarch64.rpm"
RPM_HASH = "62e393a7dfc2b9d53f35c5cf10f6fcc68eddada8916ef178cd074ed6eadf9463cff8bbbde38a663733e484942edece8bc36e4ffad9c135caa0c99fd5291a98b2"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-mvebudbarmada8k"

RDEPENDS:${PN} += ""

inherit rpm
