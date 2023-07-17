SUMMARY = "The U-Boot firmware for the rpiarm64 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rpiarm64 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-rpiarm64-2023.07-1.1.aarch64.rpm"
RPM_HASH = "4d682ac8c46bc54ca987adcfbded0dcce1605fa1c23dab10dd8aaabb2f3b962174f3460fac81ac62ecb305a1640fa9ff8aeeb0cdc687eedb2a2ab478e410a616"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rpi3 \
u-boot-rpi4 \
u-boot-rpiarm64"

RDEPENDS:${PN} += "/usr/bin/sh \
util-linux"

inherit rpm
