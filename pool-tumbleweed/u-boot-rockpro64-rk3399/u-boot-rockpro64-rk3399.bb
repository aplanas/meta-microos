SUMMARY = "The U-Boot firmware for the rockpro64-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rockpro64-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rockpro64-rk3399-2023.04-2.1.aarch64.rpm"
RPM_HASH = "0e78182d2331935e5df34328218d19e265fff640f933feed9805e555cef6e7285bb48bc30f96c92b297b746f1ea11e96b989d217b2d4393ae2e005d112697909"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rockpro64-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
