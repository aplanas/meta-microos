SUMMARY = "The U-Boot firmware for the khadas-vim2 platform"
DESCRIPTION = "Das U-Boot (or just 'U-Boot' for short) is Open Source Firmware for Embedded PowerPC, ARM, MIPS and x86 processors. \
This package contains the firmware for the khadas-vim2 platform."
LICENSE = "GPL-2.0-only"

PV = "2023.04"

RPM_NAME = "u-boot-khadas-vim2-2023.04-2.2.aarch64.rpm"
RPM_HASH = "a012440491efa213c59d040ae77d6354c3481303511adea54400a6c100ea4b3d11763f46c70123e807bc3309ce066a3964994389e68fc99a216aa9bb2f4bf9b9"

RPROVIDES:${PN} += "u-boot-khadas-vim2 \
u-boot-loader"

RDEPENDS:${PN} += ""

inherit rpm
