SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-pinephone-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "cb3a59f8ffdc5aaa9fddbe3a5756a81e360ccf9023fc102b9ac48bce7b1728c883b31ae958768b07428d3c0f24172842b7e599d3dcbec2dc75c40139b14c7f6d"

RPROVIDES:${PN} += "u-boot-pinephone-doc"

RDEPENDS:${PN} += ""

inherit rpm
