SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-mvebumcbin-88f8040-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "46f047c0f8f43896095b2633a39adcaa72383850ed6c0d3cbeb8f562b573954af966e544adbd3c54d402a9dec52ec59f1f94b203b47a67d2ba59775d50b273bb"

RPROVIDES:${PN} += "u-boot-mvebumcbin-88f8040-doc"

RDEPENDS:${PN} += ""

inherit rpm
