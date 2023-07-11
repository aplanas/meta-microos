SUMMARY = "The U-Boot firmware for the rock960-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rock960-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rock960-rk3399-2023.04-2.2.aarch64.rpm"
RPM_HASH = "2e57307e655b7a3ca3d1450104f1bea8a6345e3615f0d633b4106c3104115efdf5a3314f1e5b493998ba82761f4bf8fda0d0eeb7918cb15f5fc7e67a2375e9d6"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rock960-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
