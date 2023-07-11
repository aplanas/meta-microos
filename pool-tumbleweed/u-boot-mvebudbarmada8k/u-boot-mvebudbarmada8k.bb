SUMMARY = "The U-Boot firmware for the mvebudbarmada8k platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the mvebudbarmada8k platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-mvebudbarmada8k-2023.04-2.2.aarch64.rpm"
RPM_HASH = "2e6dfb739035b36d8b4ba1ac283f9a5f48bf0f2ff9953c1d30420ad51bd3c1c2871462565a2b8e74b841c92753a26481fbccb07cc2eaa1740b57c1a3d334f502"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-mvebudbarmada8k"

RDEPENDS:${PN} += ""

inherit rpm
