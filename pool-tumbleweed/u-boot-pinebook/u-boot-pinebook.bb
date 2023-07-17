SUMMARY = "The U-Boot firmware for the pinebook platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the pinebook platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-pinebook-2023.07-1.1.aarch64.rpm"
RPM_HASH = "88a0a2ee4d714d59d9171c7f0794ac09ec2734e0a842b3c6e06d8a679e9492a7c01387f6d57f4e76ab195679d493273158eecabba7dbf333bbd3c3b84c52b2f0"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-pinebook"

RDEPENDS:${PN} += ""

inherit rpm
