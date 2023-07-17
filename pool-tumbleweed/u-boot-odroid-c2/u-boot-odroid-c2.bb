SUMMARY = "The U-Boot firmware for the odroid-c2 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the odroid-c2 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-odroid-c2-2023.07-1.1.aarch64.rpm"
RPM_HASH = "b1ca262f81d0f113efed76842d6fba4cd3d04f6c407b327b71a2eba2412deaed681002735ce0d663b1b0d776990e5c7aff819bc5330b4151038e99aae772da8e"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-odroid-c2"

RDEPENDS:${PN} += ""

inherit rpm
