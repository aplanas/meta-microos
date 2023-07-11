SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-odroid-c4-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "f5229cb0f9a41c828e9c44081379449379fb7e1fbf0cec01b163d395da979324a973a1902718f7fdfb802d840d9956b40c94b3f7e3e52d1c53964497b20aaf6b"

RPROVIDES:${PN} += "u-boot-odroid-c4-doc"

RDEPENDS:${PN} += ""

inherit rpm
