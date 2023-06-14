SUMMARY = "The U-Boot firmware for the rpiarm64 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rpiarm64 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rpiarm64-2023.04-2.1.aarch64.rpm"
RPM_HASH = "3f2771fbe2dabb48d87b022fe3b690270b30a9d5e42ee486dc1250ec96f143cbb55280bb9ab280b81d6ad6408b1242124211a095201082e8d9d732d4df86c926"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rpi3 \
u-boot-rpi4 \
u-boot-rpiarm64"

RDEPENDS:${PN} += "/bin/sh \
util-linux"

inherit rpm
