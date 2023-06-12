SUMMARY = "The U-Boot firmware for the dragonboard820c platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the dragonboard820c platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-dragonboard820c-2023.04-2.1.aarch64.rpm"
RPM_HASH = "4aa0390730e9ffef8e5cf89d7eb54e2f58114679204388ed617b88daee933604b3ec35dccc12ecf9ade5c2ae8232fab953a51e82f2f539c75443e8f1176c337e"

RPROVIDES:${PN} += "u-boot-dragonboard820c \
u-boot-dragonboard820c(aarch-64) \
u-boot-loader"
RDEPENDS:${PN} += ""

inherit rpm
