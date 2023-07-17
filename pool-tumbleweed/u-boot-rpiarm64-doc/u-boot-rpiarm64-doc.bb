SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-rpiarm64-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "428dd1fd9a94b4a2cee04425fd139e4c89df2f9c7fea26be62a116feb49ece8e82bb054e7b2e6a08eab233d7c63ad5d269c9ad3590c7f7b47e01565a89f3e21c"

RPROVIDES:${PN} += "u-boot-rpiarm64-doc"

RDEPENDS:${PN} += ""

inherit rpm
