SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-mvebudbarmada8k-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "158fa190c4dfe51db048ca2a6ff57dc1e8a494066f5f3ac6905384e0af01968c0d552210bdd5239b8127ea5570ba2780ef87e3497bc8736109dae7556dc8bd3d"

RPROVIDES:${PN} += "u-boot-mvebudbarmada8k-doc \
u-boot-mvebudbarmada8k-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
