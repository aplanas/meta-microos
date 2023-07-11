SUMMARY = "The U-Boot firmware for the mvebudb-88f3720 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the mvebudb-88f3720 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-mvebudb-88f3720-2023.04-2.2.aarch64.rpm"
RPM_HASH = "4043c807498561dc8b9836aeed0a4831eea9e1788c58beda08c5b3cd06140b6b7190885d89ddced1ccf0f0d6778b6813db12ce4c5a48da67f7c08aa400c2b791"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-mvebudb-88f3720"

RDEPENDS:${PN} += ""

inherit rpm
