SUMMARY = "The U-Boot firmware for the rpi3 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the rpi3 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.07"

RPM_NAME = "u-boot-rpi3-2023.07-1.1.aarch64.rpm"
RPM_HASH = "ffff195a88750f4089e51af9585fb5192b594805af6e55f6213f25a9e1fd5fe6c405bd88fce130cfeed32aa311c84de62589c29f9f2e774d78720b9f76e0b0e1"

RPROVIDES:${PN} += "u-boot-loader \
u-boot-rpi3"

RDEPENDS:${PN} += "/usr/bin/sh \
util-linux"

inherit rpm
