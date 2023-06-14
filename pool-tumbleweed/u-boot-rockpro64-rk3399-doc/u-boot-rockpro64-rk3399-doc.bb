SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rockpro64-rk3399-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "fe58794e47e919bb7875c3f71d6ca1ff236b1766cb3a4bdfb135561633deafe8aadd2f68584d6b70b00a671961e1e0251c0a517d7b0ca904f7e483657f9a42e2"

RPROVIDES:${PN} += "u-boot-rockpro64-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
