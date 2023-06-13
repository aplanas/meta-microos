SUMMARY = "The U-Boot firmware for the khadas-vim2 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the khadas-vim2 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-khadas-vim2-2023.04-2.1.aarch64.rpm"
RPM_HASH = "34e6dd4a78728cb06606961d1c8e16e687501a2bc8c90e2b7293279b25a78f9a224d8f180b5b71fad78330b87ba334abe4fa2c572217efee0bd0cf4176575e98"

RPROVIDES:${PN} += "u-boot-khadas-vim2 \
u-boot-khadas-vim2(aarch-64) \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
