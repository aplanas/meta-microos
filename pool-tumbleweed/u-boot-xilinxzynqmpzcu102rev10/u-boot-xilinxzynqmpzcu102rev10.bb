SUMMARY = "The U-Boot firmware for the xilinxzynqmpzcu102rev10 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the xilinxzynqmpzcu102rev10 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-xilinxzynqmpzcu102rev10-2023.07-1.1.aarch64.rpm"
RPM_HASH = "7feed53e744fe79d2e9a54d905cff6205c51d5fa4d2c2b4095be867f1256a6a40de6a7cedf0c06d88fedd5f1cb4594db4468ab6212cb4ee11c0bfa278fbe59bc"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-xilinxzynqmpzcu102rev10"

RDEPENDS:${PN} += ""

inherit rpm
