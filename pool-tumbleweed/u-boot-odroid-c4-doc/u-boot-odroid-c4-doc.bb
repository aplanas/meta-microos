SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-odroid-c4-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "91909ea02b1126b9235ba92ecb5c74813523c5ab92713878cecb5ee5886c2a8e0ff378cba3696d970f648cdffbd239151db9a5ce6864e444588442d9dc9ca59a"

RPROVIDES:${PN} += "u-boot-odroid-c4-doc"

RDEPENDS:${PN} += ""

inherit rpm
