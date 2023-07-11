SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-mvebumcbin-88f8040-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "064d61f6d97c27e971292aa2db075475991af46766bccdabd9ca4ffcee1af6e6ad976118b41eb2d8d3f9bfb98f1a9aad845ef5cc79c14c2a0ecd2091bd8ef0d5"

RPROVIDES:${PN} += "u-boot-mvebumcbin-88f8040-doc"

RDEPENDS:${PN} += ""

inherit rpm
