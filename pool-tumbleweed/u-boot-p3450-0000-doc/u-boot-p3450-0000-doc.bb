SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-p3450-0000-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "3d5b971a87937baabe32e6d57836816051bf23df7f65403c5b48b9dab42444cec96cd6636f582e9bfb309aafff37706b06117266682a75f23fe8dadf259b2682"

RPROVIDES:${PN} += "u-boot-p3450-0000-doc"

RDEPENDS:${PN} += ""

inherit rpm
