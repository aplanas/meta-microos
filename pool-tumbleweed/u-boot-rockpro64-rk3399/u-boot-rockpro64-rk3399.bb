SUMMARY = "The U-Boot firmware for the rockpro64-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rockpro64-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-rockpro64-rk3399-2023.07-1.1.aarch64.rpm"
RPM_HASH = "3c8c35ea0fb8da72bc6eca3aa605629f0aa9322639528cb08ee2bb99981ff6b5e4508f498e66096b415e8bb53a23fc42c16dd617815aa33899fc7a24f51e5ae8"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rockpro64-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
