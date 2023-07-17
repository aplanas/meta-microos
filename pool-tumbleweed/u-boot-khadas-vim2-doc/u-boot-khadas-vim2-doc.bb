SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-khadas-vim2-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "9eb70b83e3e087481aa07ffb0f59a8df1d504d6ebca4d604d684eedce915a626d313a7282bf2ffc6e4ba5f8e85c1f60684143bb111e0594f8579670cb4cc0092"

RPROVIDES:${PN} += "u-boot-khadas-vim2-doc"

RDEPENDS:${PN} += ""

inherit rpm
