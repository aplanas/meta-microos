SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-mvebuespressobin-88f3720-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "4d799d55d75c64269a434ec3aac4cc59265fe97823b213ad0ea32a648731d7198b56f073b4c7944c4b68743f84b2f3f4c53da7e312538506d3e199b445c04908"

RPROVIDES:${PN} += "u-boot-mvebuespressobin-88f3720-doc"

RDEPENDS:${PN} += ""

inherit rpm
