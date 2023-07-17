SUMMARY = "The U-Boot firmware for the nanopc-t4-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the nanopc-t4-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-nanopc-t4-rk3399-2023.07-1.1.aarch64.rpm"
RPM_HASH = "129c000bc7fd757d13a38cd1d937bd6f661159bb9768bc7d64ac550d8a757571a279a6e26efac661a0461ff5893807595f47afea2afe482136100ab506888ccb"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-nanopc-t4-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
