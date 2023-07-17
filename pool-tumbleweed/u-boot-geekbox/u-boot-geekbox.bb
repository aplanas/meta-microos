SUMMARY = "The U-Boot firmware for the geekbox platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the geekbox platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-geekbox-2023.07-1.1.aarch64.rpm"
RPM_HASH = "22d55a98f9280e0d160c455eabe275310a538b2eca5c8d9089de8556d6db43c7985b8920bdfb34cb404bca7ac775feb147bda9a1a298609692579416785c34e8"

RPROVIDES:${PN} += "u-boot-geekbox \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
