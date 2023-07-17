SUMMARY = "The U-Boot firmware for the pineh64 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the pineh64 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-pineh64-2023.07-1.1.aarch64.rpm"
RPM_HASH = "23ee49c25816bf27518faea0bc8f974d530068c934d63db1097ad1dfb67a15a9378413c753083653ee4bdc3b1ca1290c92ec89b20db3c0a3a3e8393c93f2b77f"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-pineh64"

RDEPENDS:${PN} += ""

inherit rpm
