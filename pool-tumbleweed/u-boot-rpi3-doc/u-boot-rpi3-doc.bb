SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rpi3-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "18410f4f14450513ab4699223a75af1ffba700e6f9c7377a95d86ed93b77f1b4baeb51bb3d77faad8907c2bbeceb06481d115c03e2d95c27226f7f0c264158ba"

RPROVIDES:${PN} += "u-boot-rpi3-doc \
u-boot-rpi3-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
