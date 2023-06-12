SUMMARY = "The U-Boot firmware for the rock64-rk3328 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rock64-rk3328 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rock64-rk3328-2023.04-2.1.aarch64.rpm"
RPM_HASH = "60073d431985cc485a379da66d31319e499e2d80d04510383e1116e93f2c42f429ca30b493e3c83b91174833f6e897fe45d6d2013bfada88b1b385138a994eed"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rock64-rk3328 \
u-boot-rock64-rk3328(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
