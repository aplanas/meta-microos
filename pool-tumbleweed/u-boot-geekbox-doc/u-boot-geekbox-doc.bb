SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-geekbox-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "1024702171cefb15d656dfac88b7ee01d0c60a3e9b7baeeaf40635e8ba48f49cfd070927b5bd3450b2b0895cb5da09c7a5a5d7ee5f930dccf10d78c2999c4f9b"

RPROVIDES:${PN} += "u-boot-geekbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
