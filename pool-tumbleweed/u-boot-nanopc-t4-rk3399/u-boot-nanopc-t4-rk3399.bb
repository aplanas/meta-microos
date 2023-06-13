SUMMARY = "The U-Boot firmware for the nanopc-t4-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the nanopc-t4-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-nanopc-t4-rk3399-2023.04-2.1.aarch64.rpm"
RPM_HASH = "0cb6e7b6a35c0ee015f6d3fef38022d9274882fff24e4b68e1d0f54614df3022b382aadbc6740be084b826bf14efea860b825c6e819c2fb7bb49bb86955c6bdc"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-nanopc-t4-rk3399 \
u-boot-nanopc-t4-rk3399(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
