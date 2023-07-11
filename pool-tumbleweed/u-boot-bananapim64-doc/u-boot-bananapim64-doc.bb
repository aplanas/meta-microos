SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-bananapim64-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "b9640be1aeb5b537479e5354b1716eef22b55c043e167e5044c5ba26019b6ae3de0e542572cc0ce185d1ae1cee6c57fac1cb033ef4010486dc8cff42b7b66c1f"

RPROVIDES:${PN} += "u-boot-bananapim64-doc"

RDEPENDS:${PN} += ""

inherit rpm
