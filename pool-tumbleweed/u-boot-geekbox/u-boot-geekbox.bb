SUMMARY = "The U-Boot firmware for the geekbox platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the geekbox platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-geekbox-2023.04-2.2.aarch64.rpm"
RPM_HASH = "e936f29fb45b47e267872838c51950bdc5a17b45465b4eae3cd000e99f25347af22e51adfc418da89e77178f235a75e94c83811bd5aafbefd86687658b18683a"

RPROVIDES:${PN} += "u-boot-geekbox \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
