SUMMARY = "The U-Boot firmware for the odroid-n2 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the odroid-n2 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-odroid-n2-2023.04-2.1.aarch64.rpm"
RPM_HASH = "a824738ceadee3107ffde80ad74cddb6eb8201e5d0d61666cc02b0e9f257287104f1583acb246b7f7773f3152c5bc8d3e283a5deb09ede502d6bef720d18eed5"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-odroid-n2"

RDEPENDS:${PN} += ""

inherit rpm
