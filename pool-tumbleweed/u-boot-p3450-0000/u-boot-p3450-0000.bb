SUMMARY = "The U-Boot firmware for the p3450-0000 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the p3450-0000 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-p3450-0000-2023.07-1.1.aarch64.rpm"
RPM_HASH = "122adc236210dbd38eee69641945129a94113290b09b000c019221da2a7679b675d64b54bdf59b2fa7ba50ab26b36f1e0155fe70df0d01854deb5246ecc5dd9e"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-p3450-0000"

RDEPENDS:${PN} += ""

inherit rpm
