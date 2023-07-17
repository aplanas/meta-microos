SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-rock960-rk3399-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "4db7035771c5169c3065fe86ddccdb87fad5cd84226dd49f8855edb291b3cae73efbc4241ab88a4daea3670648b2cf9629aef6dcd457e6056b5652a27c11b3a0"

RPROVIDES:${PN} += "u-boot-rock960-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
