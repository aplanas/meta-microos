SUMMARY = "The U-Boot firmware for the orangepipc2 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the orangepipc2 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-orangepipc2-2023.04-2.2.aarch64.rpm"
RPM_HASH = "f5e0761c1edba17c8966bac295a51c4d3e92eda23f9fbffc163dff1c4b0fd9ae8d8ac6c72979c0bad9a353d7cfb22ba586ffabf6c564064a31eb50711395ee26"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-orangepipc2"

RDEPENDS:${PN} += ""

inherit rpm
