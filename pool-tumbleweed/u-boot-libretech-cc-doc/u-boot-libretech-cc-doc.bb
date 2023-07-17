SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-libretech-cc-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "f793bed8775e44fb7fb80b2f8eeab20258c4ac8e5ef9079ff6d6ae7f04a1646e1468818915092a12daf733c6fe2cc6c769743406a8fa70ec81ea040e757f066b"

RPROVIDES:${PN} += "u-boot-libretech-cc-doc"

RDEPENDS:${PN} += ""

inherit rpm
