SUMMARY = "The U-Boot firmware for the orangepizero2 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the orangepizero2 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-orangepizero2-2023.04-2.1.aarch64.rpm"
RPM_HASH = "55418c48057333e2f83b60e7a2d12aeccfc160cd6e8b6994a78365966e1b552649f1567575fcef5cc731cdbabdbbcf1a055d5378ec2659b3ab69d0adc67218b1"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-orangepizero2"

RDEPENDS:${PN} += ""

inherit rpm
