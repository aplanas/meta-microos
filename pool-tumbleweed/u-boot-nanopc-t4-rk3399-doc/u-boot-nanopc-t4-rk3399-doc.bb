SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-nanopc-t4-rk3399-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "4be0bfea17296e84b08035b47e3d1578af20ff47a987408e50ffc6341e6a641233d5edddfb15db297ddd4129deabbdb0e324f7adafc82f1a054dec147f5140fa"

RPROVIDES:${PN} += "u-boot-nanopc-t4-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
