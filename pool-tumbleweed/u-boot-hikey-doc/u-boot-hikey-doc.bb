SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-hikey-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "d808654aa24cac06e25bed89f7e67407e2e2284d0fa9f6b4486b7e0055bdeb5df0fb3851d94a91df538476d35c3edac3bf87fde8015dee40c967d22ce8126bff"

RPROVIDES:${PN} += "u-boot-hikey-doc"

RDEPENDS:${PN} += ""

inherit rpm
