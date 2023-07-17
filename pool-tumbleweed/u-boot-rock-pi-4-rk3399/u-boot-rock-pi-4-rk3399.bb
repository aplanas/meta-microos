SUMMARY = "The U-Boot firmware for the rock-pi-4-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rock-pi-4-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-rock-pi-4-rk3399-2023.07-1.1.aarch64.rpm"
RPM_HASH = "eefc32acc9d7a6098e3f9b78ec0c8ed367a7e3a1b548926f4b47adfe2d184b8e089fbfea28444777672973c7de8c395389c8d22430a6d31473f2294f88cbb88b"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rock-pi-4-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
