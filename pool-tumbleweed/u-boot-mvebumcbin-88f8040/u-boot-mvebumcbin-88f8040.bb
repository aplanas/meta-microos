SUMMARY = "The U-Boot firmware for the mvebumcbin-88f8040 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the mvebumcbin-88f8040 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-mvebumcbin-88f8040-2023.04-2.2.aarch64.rpm"
RPM_HASH = "5f00524c627a3a2f9022f2e2431ad947101debb1610ef65a24110f0c3abae99adb35b65496fc92128fffde13cd9ec920a4a67e9bf5e977efe7f2d46f02d706c0"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-mvebumcbin-88f8040"

RDEPENDS:${PN} += ""

inherit rpm
