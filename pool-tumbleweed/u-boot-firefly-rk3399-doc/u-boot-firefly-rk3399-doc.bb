SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-firefly-rk3399-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "817c4540e6e09daa452ae8d697d04cb8e24a85347b08bdc11bc5f82bd1be31f5d34431a9334dedbeea7c77e29b61d246d090977958679beed8d9e421fd468470"

RPROVIDES:${PN} += "u-boot-firefly-rk3399-doc"

RDEPENDS:${PN} += ""

inherit rpm
