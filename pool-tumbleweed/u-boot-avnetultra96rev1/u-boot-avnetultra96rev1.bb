SUMMARY = "The U-Boot firmware for the avnetultra96rev1 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the avnetultra96rev1 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-avnetultra96rev1-2023.04-2.2.aarch64.rpm"
RPM_HASH = "a7022fb2e37f9c318685db147b5e1c93c913c498b58842235927975ffe25a34be45425043ebce41123f9d15ddf5bc9db64b6bb0e2ea419a91a8ffed7d1b0d66b"

RPROVIDES:${PN} += "u-boot-avnetultra96rev1 \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
