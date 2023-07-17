SUMMARY = "The U-Boot firmware for the xilinxzynqmpvirt platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the xilinxzynqmpvirt platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-xilinxzynqmpvirt-2023.07-1.1.aarch64.rpm"
RPM_HASH = "f8c3bb329de6c5c51bd9b6ed291c694d8e9f931ae49bce573a683a06ff3df9814b773f6efa8674fca840b0726be13fc191e2cf9d96c0cb6595c02d0c809e2bb0"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-xilinxzynqmpgeneric \
u-boot-xilinxzynqmpvirt"

RDEPENDS:${PN} += ""

inherit rpm
