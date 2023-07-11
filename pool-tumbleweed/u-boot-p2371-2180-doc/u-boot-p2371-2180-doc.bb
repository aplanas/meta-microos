SUMMARY = "Documentation for the U-Boot Firmware"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains documentation for U-Boot firmware."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-p2371-2180-doc-2023.04-2.2.aarch64.rpm"
RPM_HASH = "c020cc74fc56732b145fc75487db4c80b95be84965b7156225b2418715e829101a3a75f708f3054346c3dfed2122525796ffb75a3317777ec0ffad4236140d61"

RPROVIDES:${PN} += "u-boot-p2371-2180-doc"

RDEPENDS:${PN} += ""

inherit rpm
