SUMMARY = "The U-Boot firmware for the xilinxzynqmpzcu102rev10 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the xilinxzynqmpzcu102rev10 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-xilinxzynqmpzcu102rev10-2023.04-2.2.aarch64.rpm"
RPM_HASH = "25e3282db7ebfc44bbe8591141626d2e8412dd26b64754bd047ee3fa66b578ea9be64e22c1261a788788eca11919b7ad2b0b10bb1e12f3c12cf990ab8b30e810"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-xilinxzynqmpzcu102rev10"

RDEPENDS:${PN} += ""

inherit rpm
