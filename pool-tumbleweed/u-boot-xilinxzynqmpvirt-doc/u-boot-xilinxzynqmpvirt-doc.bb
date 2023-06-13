SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-xilinxzynqmpvirt-doc-2023.04-2.1.aarch64.rpm"
RPM_HASH = "691d869421be7973bf894230dc13c615c522d09590c67a344cc5e1036d94a190500c7ef048f2c84d236a63cc3de064bb9daf42add12a1079d82c4b1ccf0673b1"

RPROVIDES:${PN} += "u-boot-xilinxzynqmpvirt-doc \
u-boot-xilinxzynqmpvirt-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
