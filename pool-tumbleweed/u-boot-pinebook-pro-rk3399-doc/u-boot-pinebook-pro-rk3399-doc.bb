SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-pinebook-pro-rk3399-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "295a9a46015f0ab3cfbfb05fa95746c1dca177d498e9be97eacf1f39d2926dd4acb41b64b4950c6df69dbb3b694dac4ccca5a866590f7803f729b75f2b3800c3"

RPROVIDES:${PN} += "u-boot-pinebook-pro-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
