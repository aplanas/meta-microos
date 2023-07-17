SUMMARY = "The U-Boot firmware for the hikey platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the hikey platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-hikey-2023.07-1.1.aarch64.rpm"
RPM_HASH = "47ce6be4ce727e1457afa211b93bca170e3ddf1a21dda7db5a02976fd30fbc054e741e341ceffd496fb471329d5095e190e0cc86047564681394932244adc055"

RPROVIDES:${PN} += "u-boot-hikey \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
