SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-nanopi-m4b-rk3399-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "2738bd5e5fe7fbe4b93518e981a0c5906c5a137c0c9494f813b2962614584944c59dcf8c47fd1c434e1a8c0dbe783e6b139dc1793e2b020bf4bfe419b9c24df3"

RPROVIDES:${PN} += "u-boot-nanopi-m4b-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
