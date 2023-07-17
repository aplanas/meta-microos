SUMMARY = "The U-Boot firmware for the evb-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the evb-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-evb-rk3399-2023.07-1.1.aarch64.rpm"
RPM_HASH = "27483deb3f676b74a22ee437d5fd789dae39e5b4fbaafd6f6a4c209bbed656491e5ff1d04d221d3db21ec01e7ef12b538214651a245e24949d6e1fdfe9a02346"

RPROVIDES:${PN} += "u-boot-evb-rk3399 \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
