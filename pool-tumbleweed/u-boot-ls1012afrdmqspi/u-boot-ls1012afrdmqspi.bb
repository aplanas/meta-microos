SUMMARY = "The U-Boot firmware for the ls1012afrdmqspi platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the ls1012afrdmqspi platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-ls1012afrdmqspi-2023.07-1.1.aarch64.rpm"
RPM_HASH = "5331e17f5bad664910ffaac76d4b077304f67d486ab42290224fa8fe0ebfec2472ab0e739cfa58999e7331a8089b498dc0c47469e2e1c09bf024cd6abaade24b"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-ls1012afrdmqspi"

RDEPENDS:${PN} += ""

inherit rpm
