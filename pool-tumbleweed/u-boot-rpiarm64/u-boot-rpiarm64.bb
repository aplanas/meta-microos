SUMMARY = "The U-Boot firmware for the rpiarm64 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rpiarm64 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rpiarm64-2023.04-2.2.aarch64.rpm"
RPM_HASH = "4dce988e2dbed9a1d0b1e87bca8d5686d5c7172d7c4cf49b3cc9ea6580ab4060fc38aebae8ff774756c1fe66f8fc499ef6fa9df4e0897031a87bee71cc3cbf24"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rpi3 \
u-boot-rpi4 \
u-boot-rpiarm64"

RDEPENDS:${PN} += "/usr/bin/sh \
util-linux"

inherit rpm
