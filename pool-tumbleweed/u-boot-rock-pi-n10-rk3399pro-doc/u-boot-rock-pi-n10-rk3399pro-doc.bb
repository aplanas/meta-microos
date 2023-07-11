SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rock-pi-n10-rk3399pro-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "21773415391ab459967a2876f8acc41c19eca043e363339a072ced226bed164048995ddb6124829cdf7290a43a5007c789303a331bdf21a20e1f42f376ba26b9"

RPROVIDES:${PN} += "u-boot-rock-pi-n10-rk3399pro-doc"

RDEPENDS:${PN} += ""

inherit rpm
