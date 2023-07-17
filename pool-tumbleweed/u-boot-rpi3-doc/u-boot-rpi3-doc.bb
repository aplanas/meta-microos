SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-rpi3-doc-2023.07-1.1.aarch64.rpm"
RPM_HASH = "ad49b88dda6559d1a7e2a3757c4c8daa240f64310610f6053df3cfe8696cc91a07483391bda14e07d438a2cdb05c3d9995fc02af556275af3e5b2e1e936421c6"

RPROVIDES:${PN} += "u-boot-rpi3-doc"

RDEPENDS:${PN} += ""

inherit rpm
