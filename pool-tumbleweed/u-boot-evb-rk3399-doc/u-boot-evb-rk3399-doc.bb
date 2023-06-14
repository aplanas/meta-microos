SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-evb-rk3399-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "1429fce10c212670b444cfd1497d745d0d29a0cd9e2c45583b8f08a792faf2cf5fdc7ab1fd2e74a6fc425619f8cc7be1e19953cd4cd36975478476c061dafbf7"

RPROVIDES:${PN} += "u-boot-evb-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
