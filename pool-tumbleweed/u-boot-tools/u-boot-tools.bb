SUMMARY = "Tools for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains: \
mkimage- a tool that creates kernel bootable images for U-Boot."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-tools-2023.04-2.2.aarch64.rpm"
RPM_HASH = "c53bf4e63363e5e0c05f866e3f6743239751df4523d2588be0670bbad8280acaaf769307c25fb13303d8d81d20c41cb157a33c5a528d920fc648e9fa392d1c28"

RPROVIDES:${PN} += "u-boot-tools"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libssl.so.3"

inherit rpm
