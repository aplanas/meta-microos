SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-odroid-n2-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "3f9cafc7fa8490d818ba66fa02d0a79f8e9ba9516a9198d4ced56eb276c5c5545b35c7632b41e2c26e5bb3f75c79f20171ab3bdd7d2d2f410eb25b1cebf25612"

RPROVIDES:${PN} += "u-boot-odroid-n2-doc"

RDEPENDS:${PN} += ""

inherit rpm
