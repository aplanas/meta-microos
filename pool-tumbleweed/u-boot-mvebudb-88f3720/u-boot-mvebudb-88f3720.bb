SUMMARY = "The U-Boot firmware for the mvebudb-88f3720 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the mvebudb-88f3720 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-mvebudb-88f3720-2023.04-2.1.aarch64.rpm"
RPM_HASH = "3c8f7068645ad979f9589d1bb9ee5f35ff71157ebd75dfded2c55ec39f3e5eee903c2be7d1143a3c1aface6e80be66bc8bab94dcbf20e6ec2bee5ce9dd09f672"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-mvebudb-88f3720 \
u-boot-mvebudb-88f3720(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
