SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-xilinxzynqmpzcu102rev10-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "9d29d646a2d0d423c81920c4a0cbdfc3c02c67fad04a05acc9dae8b64eea7bb41ec17917465c223a01d3314c4b4c6d1877676d71b1022aed8bcdabc7ab1295b1"

RPROVIDES:${PN} += "u-boot-xilinxzynqmpzcu102rev10-doc"

RDEPENDS:${PN} += ""

inherit rpm
