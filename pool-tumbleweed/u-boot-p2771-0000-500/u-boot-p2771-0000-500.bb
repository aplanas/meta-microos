SUMMARY = "The U-Boot firmware for the p2771-0000-500 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the p2771-0000-500 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-p2771-0000-500-2023.04-2.2.aarch64.rpm"
RPM_HASH = "0d76a8a05fd6329ebea1d8d4ec89816936844f6e685aa510add22b68736d999fbe1677ba69be3f7730db5f5e82068762411ffe45701ca5dbce6cb6a5c094e6b0"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-p2771-0000-500"

RDEPENDS:${PN} += ""

inherit rpm
