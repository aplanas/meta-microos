SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-geekbox-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "e78d5eecd1224a576f2833b54877a18f340e9109a670489b43010cc6f2de65d149a83aa477acf0ff362989ad52b9be54ddf1f58a59305bfdd15f8e58545ba5c1"

RPROVIDES:${PN} += "u-boot-geekbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
