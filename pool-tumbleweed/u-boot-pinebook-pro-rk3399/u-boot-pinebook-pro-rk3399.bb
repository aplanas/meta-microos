SUMMARY = "The U-Boot firmware for the pinebook-pro-rk3399 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the pinebook-pro-rk3399 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-pinebook-pro-rk3399-2023.04-2.1.aarch64.rpm"
RPM_HASH = "304ce48da7b205053c3ba555b5785cccf73d87eeaab476272d0614a11b432dc69e640a061e0bf53f93b16d89bb94b96a687dcabcc8d79f03a49d63e073063fc5"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-pinebook-pro-rk3399 \
u-boot-pinebook-pro-rk3399(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
