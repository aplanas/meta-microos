SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-rock64-rk3328-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "f098f16f650609bfe97a20025d52ce4839fadc9e5d1d752b7f83d9706b7d1e25b92486ee98ed4b5d27bc4a48094135fbc80997a7c60fd3360b38c52f55d51910"

RPROVIDES:${PN} += "u-boot-rock64-rk3328-doc"

RDEPENDS:${PN} += ""

inherit rpm
