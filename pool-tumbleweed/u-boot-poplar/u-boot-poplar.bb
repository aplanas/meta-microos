SUMMARY = "The U-Boot firmware for the poplar platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the poplar platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-poplar-2023.04-2.1.aarch64.rpm"
RPM_HASH = "7b6d6350f5f57601fb2f4f00b5b970b2455e0a1161e66841e022f03b7f66109733b6cc052a96f6129632e6bfe3ca5f75cb58d811ad6c53479df8eb6d5f6b8b59"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-poplar \
u-boot-poplar(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
