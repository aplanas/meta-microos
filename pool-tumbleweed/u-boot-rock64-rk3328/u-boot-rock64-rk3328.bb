SUMMARY = "The U-Boot firmware for the rock64-rk3328 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rock64-rk3328 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-rock64-rk3328-2023.07-1.1.aarch64.rpm"
RPM_HASH = "0fdbefe81947dfbf760565d7de81582fdf1fe478bb821e1ac89f88abcf2bb3e293883bfe0ef83d764af4c3daad7966ccfa39fa7cd95d77ede900bba0613a4ae0"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rock64-rk3328"

RDEPENDS:${PN} += ""

inherit rpm
