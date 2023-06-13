SUMMARY = "The U-Boot firmware for the libretech-cc platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the libretech-cc platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-libretech-cc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "6004ff1f7bcdd8eef2579e30b6d294b811e8018dddfe916dc6f24456c2e1d56b0c7c4ee12a511cdd7af1cc739c3b14ce8f7f7f670a9180b63f378b95c1904619"

RPROVIDES:${PN} += "u-boot-libretech-cc \
u-boot-libretech-cc(aarch-64) \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
