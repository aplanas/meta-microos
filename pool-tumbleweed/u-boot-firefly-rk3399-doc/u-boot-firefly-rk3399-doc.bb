SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-firefly-rk3399-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "387534625344bc901deebfc0170835166ce85bed5d87dd52d3337259cf274d7ff62a17d489293f92b4b0cda40a3e7930f7ac8f2a3cbd5e04378859eede66aff2"

RPROVIDES:${PN} += "u-boot-firefly-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
