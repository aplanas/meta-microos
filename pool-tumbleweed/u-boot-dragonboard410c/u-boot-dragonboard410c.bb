SUMMARY = "The U-Boot firmware for the dragonboard410c platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the dragonboard410c platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-dragonboard410c-2023.07-1.1.aarch64.rpm"
RPM_HASH = "3f4b0b1e7e52b85f0c29fdc743a60955a32a196274214ddd1d3bbbf028e96d4b7c0d55f84400efa94b1e124e520ecaf546ebbea668cbe83e506c7dae12490c78"

RPROVIDES:${PN} += "u-boot-dragonboard410c \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
