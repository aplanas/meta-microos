SUMMARY = "The U-Boot firmware for the odroid-c4 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the odroid-c4 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-odroid-c4-2023.07-1.1.aarch64.rpm"
RPM_HASH = "6c35efbd912a8a3571ffb5e9949a47ed7b3a622a7ea25ff241c7ef020ae5f858e30a6d16de220cc535b974027729c289488db4ac53340c4517729cc6dce24de0"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-odroid-c4"

RDEPENDS:${PN} += ""

inherit rpm
