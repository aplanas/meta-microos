SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-xilinxzynqmpzcu102rev10-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "c9de4b63efe32a217109d228bd0022039b455066648cb5561aa634798926506b618d4b1d07175bc13cb0f46671581ec7fd54bddd0542fc50e563eae33dd32193"

RPROVIDES:${PN} += "u-boot-xilinxzynqmpzcu102rev10-doc"

RDEPENDS:${PN} += ""

inherit rpm
