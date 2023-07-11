SUMMARY = "The U-Boot firmware for the rpi4 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rpi4 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-rpi4-2023.04-2.2.aarch64.rpm"
RPM_HASH = "190557fce41b7e69f8420c45044eb26727ed77a44563eece5d392ad7bd099205227d6aedeed353a30927bb842922683d98898169edd2595068ec2407c34eb1e3"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rpi4"

RDEPENDS:${PN} += "/usr/bin/sh \
util-linux"

inherit rpm
