SUMMARY = "The U-Boot firmware for the rockpro64-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rockpro64-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rockpro64-rk3399-2023.04-2.2.aarch64.rpm"
RPM_HASH = "7bdd0b52439a4d0e04f3c5f00a424ca4af882666e9f447b22717e04afacc9e61298bc556a5f640f47dae6b5cd1756f1442ff4d58179a694fad411777557dfad6"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rockpro64-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
