SUMMARY = "The U-Boot firmware for the xilinxzynqmpvirt platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the xilinxzynqmpvirt platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-xilinxzynqmpvirt-2023.04-2.2.aarch64.rpm"
RPM_HASH = "6235224b8d60b0a076d4418392b3ac8ed8675c9ff57be9f339a78b4952c00c6f4b233eac0f0ad32a39da232ca971ff7a01e825aebb807f183598e361f493b1e6"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-xilinxzynqmpgeneric \
u-boot-xilinxzynqmpvirt"

RDEPENDS:${PN} += ""

inherit rpm
