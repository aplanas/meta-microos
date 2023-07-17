SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-mvebudbarmada8k-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "5c8026ff9c3234d61eeb1fee3c8c9ce79dccf670e85c7f8ff92f6e993440709eba5ea0fabf92092dcec233eff705cde7701a7751bc2ba1e9241e72a8ef348fff"

RPROVIDES:${PN} += "u-boot-mvebudbarmada8k-doc"

RDEPENDS:${PN} += ""

inherit rpm
