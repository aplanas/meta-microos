SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-dragonboard410c-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "a992ba9c57da786b4d7705ff3163a51cce9d6d2fe8eea34f11b99225c0d3b5192094bc43413605a85300a6ddedb93751a2581dac95e249899cd6e366b623ae06"

RPROVIDES:${PN} += "u-boot-dragonboard410c-doc \
u-boot-dragonboard410c-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
