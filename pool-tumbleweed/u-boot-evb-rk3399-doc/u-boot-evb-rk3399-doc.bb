SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-evb-rk3399-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "eb594d2e16e7f5b4fce9a028e708551d721d38d56f1bc150b4fb6e7a611de14e42870202e5c606472e2e2920c96bed256e268eb2d90cd229896a413f2fbcc983"

RPROVIDES:${PN} += "u-boot-evb-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
