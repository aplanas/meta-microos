SUMMARY = "The U-Boot firmware for the pine64plus platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the pine64plus platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-pine64plus-2023.04-2.2.aarch64.rpm"
RPM_HASH = "f9d655fcd5f9ee952fb4919782a26a47738f2983f28f14477aec4b1bf48020f85690966b75c4a292a6c6c0c8d94c9b985f7cd25291e7b8bcac9320be12de7b6a"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-pine64plus"

RDEPENDS:${PN} += ""

inherit rpm
