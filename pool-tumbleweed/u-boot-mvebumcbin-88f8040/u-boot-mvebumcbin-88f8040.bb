SUMMARY = "The U-Boot firmware for the mvebumcbin-88f8040 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the mvebumcbin-88f8040 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-mvebumcbin-88f8040-2023.07-1.1.aarch64.rpm"
RPM_HASH = "184cd477748cf6248c28a555e51f69b6eaa43877a4262bee68f531c656bab565140aade328e5b1d81a7af98c95b29877c0df0441ce7c0f8ee7265130c9ff2a57"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-mvebumcbin-88f8040"

RDEPENDS:${PN} += ""

inherit rpm
