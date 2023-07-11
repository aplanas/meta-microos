SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-evb-rk3399-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "6ca1d58c817479afdb8de3ab109c83c6400ee6006db6d4a254abd9ac66922e4e7c4ca74c35300af204c80ce25534256c7686f51d7ec2bf121f9d68446433db1d"

RPROVIDES:${PN} += "u-boot-evb-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
