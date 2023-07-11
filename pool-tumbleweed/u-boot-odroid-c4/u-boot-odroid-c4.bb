SUMMARY = "The U-Boot firmware for the odroid-c4 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the odroid-c4 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-odroid-c4-2023.04-2.2.aarch64.rpm"
RPM_HASH = "9a15819637082e64398f4efb9bc8d664f2e765cf5517ff0457e5b2be724ef1ec7f643995adf8be744ff11bb4729b3bb3c01d1aa8ad0ad3251e6effdc295675e1"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-odroid-c4"

RDEPENDS:${PN} += ""

inherit rpm
