SUMMARY = "The U-Boot firmware for the p2371-2180 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the p2371-2180 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-p2371-2180-2023.07-1.1.aarch64.rpm"
RPM_HASH = "0ad04931737aa4caa13c1491fcc731d9200d1c14be43e3ef15e56d91182fc5178ab5f4d789ccc91d7cf45d1283323572b9677e80772697345ca92c6cf9783e92"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-p2371-2180"

RDEPENDS:${PN} += ""

inherit rpm
