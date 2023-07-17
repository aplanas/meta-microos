SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-orangepipc2-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "28365075089f257bd7ae6777400cdb6d1bbd60735d62ea7b94c42c4fcc562434b9570cf029ccea76a23f3bbe0c00d473b1c7b9e03cfb0395907a0ef52754fc5e"

RPROVIDES:${PN} += "u-boot-orangepipc2-doc"

RDEPENDS:${PN} += ""

inherit rpm
