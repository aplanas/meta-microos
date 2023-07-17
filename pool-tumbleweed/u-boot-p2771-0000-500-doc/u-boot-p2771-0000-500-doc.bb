SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-p2771-0000-500-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "584dd1d15f10f0e9ce6ceb8cc97cf01d990dcabd9cdf298e36762d2ccca80f937a5218c17260013a7a999f23c23c742d5257305df2535b3f15c19dc5106d9bed"

RPROVIDES:${PN} += "u-boot-p2771-0000-500-doc"

RDEPENDS:${PN} += ""

inherit rpm
