SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rockpro64-rk3399-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "dac651179497eba00367734c34d2a4587d5f62dfec0c639dfc1f33b8d4e6afb059ec0b145fb491f053f2e944f79a924e281d3a538f5e470e0fbe83265afde5fa"

RPROVIDES:${PN} += "u-boot-rockpro64-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
