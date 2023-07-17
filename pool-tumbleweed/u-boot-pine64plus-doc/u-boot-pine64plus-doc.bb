SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-pine64plus-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "dec1d4982f9dba4aff6a23bef17468a2d7283032b9f97a7aa454c7f3f3c5d1d92b040809203bd871e2249562829346c970b2069c63fc59c1c0184d439e8ea80f"

RPROVIDES:${PN} += "u-boot-pine64plus-doc"

RDEPENDS:${PN} += ""

inherit rpm
