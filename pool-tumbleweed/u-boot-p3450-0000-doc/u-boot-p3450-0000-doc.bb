SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-p3450-0000-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "0809f38849ab1d29aa2657352721125ebb194aaf2205958e851d286e292ddef08b0b8321221ae7c94692d67f8d87b20545b624e77239e72e003ba544a16226ac"

RPROVIDES:${PN} += "u-boot-p3450-0000-doc"

RDEPENDS:${PN} += ""

inherit rpm
