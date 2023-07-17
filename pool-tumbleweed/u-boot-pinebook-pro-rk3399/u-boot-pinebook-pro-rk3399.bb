SUMMARY = "The U-Boot firmware for the pinebook-pro-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the pinebook-pro-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-pinebook-pro-rk3399-2023.07-1.1.aarch64.rpm"
RPM_HASH = "e0a75c5108692be93d4577493c1a930181bb469ff7f2d7fe26e8240087d328cfc4e805c0d7aeccc00542597cf048f1cf634c7c26ed92919264b4d48d34778400"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-pinebook-pro-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
