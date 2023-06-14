SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rpi4-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "e5208cdeb828e663ec3701fd753f90e900d84fc8b827496f42a9014df086b81ac5187c76bc45f15469753f2f6a5599f88bfc09201d0e5212ced24e35c0a895b4"

RPROVIDES:${PN} += "u-boot-rpi4-doc"

RDEPENDS:${PN} += ""

inherit rpm
