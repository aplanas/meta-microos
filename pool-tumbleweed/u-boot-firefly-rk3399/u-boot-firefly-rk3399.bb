SUMMARY = "The U-Boot firmware for the firefly-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the firefly-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-firefly-rk3399-2023.04-2.2.aarch64.rpm"
RPM_HASH = "bf624121cb84cdaf5b72826f41fef54411a150d93b2eae300a729b56ae9c154cd7b4813484444fb3540cd75b60b6f59b728df17786798740f86bafb3e1bd044d"

RPROVIDES:${PN} += "u-boot-firefly-rk3399 \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
