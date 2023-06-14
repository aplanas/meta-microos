SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-geekbox-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "a6960959fa2769c466a8112bfc3492479014d9e9d1af49105985e130a8c49e24b6fb8b7a0ca5e69d1c53efe9decc725c984ed75c7a7d98e2b486e61d11f83fae"

RPROVIDES:${PN} += "u-boot-geekbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
