SUMMARY = "The U-Boot firmware for the p2771-0000-500 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the p2771-0000-500 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-p2771-0000-500-2023.07-1.1.aarch64.rpm"
RPM_HASH = "0a8662aad683c7c8d4c0d33b568b24f3be88772f8735b74f7b27c77c32d9ad21c5198e0245e8521655affd4cb36b5911ee7ddef6493887f11bcf7bf92ff3c92b"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-p2771-0000-500"

RDEPENDS:${PN} += ""

inherit rpm
