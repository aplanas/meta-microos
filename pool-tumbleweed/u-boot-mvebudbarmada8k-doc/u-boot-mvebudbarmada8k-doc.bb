SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-mvebudbarmada8k-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "72e68373c8f3ff79e1cf5cf17b1999c6da2efc36275bfeef938148fdf048d70ddcf07b879bd384eddedd99ce67d09fe834b3229ea6aaab5c7530bad5096152a0"

RPROVIDES:${PN} += "u-boot-mvebudbarmada8k-doc"

RDEPENDS:${PN} += ""

inherit rpm
