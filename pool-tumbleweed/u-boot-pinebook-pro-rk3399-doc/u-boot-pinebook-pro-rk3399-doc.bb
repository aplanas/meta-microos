SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-pinebook-pro-rk3399-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "1e8cbe4b5c4b3746802635fa87506d6227affb89e75343e81fe4f60f3e0a27e87a451cccf16930f833754ceab4666c6644bbc96d1d57f4629a667eb279d65998"

RPROVIDES:${PN} += "u-boot-pinebook-pro-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
