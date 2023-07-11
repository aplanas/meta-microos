SUMMARY = "The U-Boot firmware for the ls1012afrdmqspi platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the ls1012afrdmqspi platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-ls1012afrdmqspi-2023.04-2.2.aarch64.rpm"
RPM_HASH = "1fbab2c160b677a019ee2bed02f3fdf57e0646b32798d2f11e6b3a81e348c48518bcc0e6449c4f96949420c11c9de9e63da3478a13f80957ca46abc9d08f9e8a"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-ls1012afrdmqspi"

RDEPENDS:${PN} += ""

inherit rpm
