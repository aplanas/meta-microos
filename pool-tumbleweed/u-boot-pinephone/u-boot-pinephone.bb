SUMMARY = "The U-Boot firmware for the pinephone platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the pinephone platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-pinephone-2023.04-2.1.aarch64.rpm"
RPM_HASH = "796e8c8f1b7db974b9b8aff9b1643f6ea83bda4b0b356cc9471bb8b3d780892493b7d24fa5fef0aa8d398582f8633a765092f115e55e3aaa84fe6cdf4b9eefeb"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-pinephone"

RDEPENDS:${PN} += ""

inherit rpm
