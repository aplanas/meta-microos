SUMMARY = "The U-Boot firmware for the pinephone platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the pinephone platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-pinephone-2023.07-1.1.aarch64.rpm"
RPM_HASH = "67a62e024871c0bea2233248f615f8d2a447cd9bc5da36cac97139593943cab16d15bee98cd9857fa74c3cbabccdfdf3a8f59152ef91a98302c6c0b7f8fcc7df"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-pinephone"

RDEPENDS:${PN} += ""

inherit rpm
