SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-xilinxzynqmpvirt-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "a53eceeb3f252d205195a80f8b641318cc22fb3d6395b62166acc59f4e7ee10a64f33ed8d802a46bb03b7b3b81a6557ac219b9d890b4581c4238ac62a0432871"

RPROVIDES:${PN} += "u-boot-xilinxzynqmpvirt-doc"

RDEPENDS:${PN} += ""

inherit rpm
