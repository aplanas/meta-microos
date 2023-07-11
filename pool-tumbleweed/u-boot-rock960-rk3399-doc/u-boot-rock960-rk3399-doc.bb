SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rock960-rk3399-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "93a489f043420db073c5603084ab132c83d0a73d3027085af81c0ce8550220640dcf84e2b26b8abff4ef9aaabaa197a1cee30c32063a316100ec65118462e500"

RPROVIDES:${PN} += "u-boot-rock960-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
