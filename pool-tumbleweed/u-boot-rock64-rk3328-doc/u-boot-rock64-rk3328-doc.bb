SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rock64-rk3328-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "0edf68ac9eea85f861b275fd7054a53fe4782981085d26873b7ba926975654d003a3cec1b56f82bf29dce3074b8b03b64a95d36801500e8c1d0c5f54cbcf39b6"

RPROVIDES:${PN} += "u-boot-rock64-rk3328-doc"

RDEPENDS:${PN} += ""

inherit rpm
