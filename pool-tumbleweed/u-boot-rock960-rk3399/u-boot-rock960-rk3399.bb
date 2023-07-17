SUMMARY = "The U-Boot firmware for the rock960-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rock960-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-rock960-rk3399-2023.07-1.1.aarch64.rpm"
RPM_HASH = "5dcd62565359b0e83ffb0cdd8000657fe8188e3ff40e9a5165ad748cf8e7549f01192fe867bdb7f9689d26de9ea2ac6d50347aeed32fecd0a712e6e2e5f8f71b"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rock960-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
