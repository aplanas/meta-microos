SUMMARY = "The U-Boot firmware for the orangepipc2 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the orangepipc2 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-orangepipc2-2023.07-1.1.aarch64.rpm"
RPM_HASH = "e99b49d04ad7fa0b5923699908a61eacbe9d8f831d23ee389b5e13139694ed233d8deb1d9fed42b0577bc0d78db8dd45fce8a78f1ba9229f010ae2ecb7d4c8ea"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-orangepipc2"

RDEPENDS:${PN} += ""

inherit rpm
