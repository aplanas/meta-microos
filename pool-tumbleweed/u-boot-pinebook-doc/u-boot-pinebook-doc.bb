SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-pinebook-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "cff97b5b29f8e335591638eefad6b1fce64cdf5fa738fe4053bd3656ef708ea48f8e82020156714e206f9584726010d8b7f6b8acb14b2bfa9b0d102d4ea337b5"

RPROVIDES:${PN} += "u-boot-pinebook-doc"

RDEPENDS:${PN} += ""

inherit rpm
