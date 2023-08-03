SUMMARY = "Kernel firmware file for open NVIDIA kernel module driver G06"
DESCRIPTION = "This package contains the versioned kernel firmware file 'gsp.bin' for \
the OpenSource NVIDIA kernel module driver G06."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "535.86.05"

RPM_NAME = "kernel-firmware-nvidia-gsp-G06-535.86.05-1.1.aarch64.rpm"
RPM_HASH = "86e7ba840a11befb78230bfc2bb4a815b12a1b5d9f59500471c8dac75895052827300ac985041c5f6d0428a918d2f99bb8f30b3fb97f0dbd5d19ebb82320b335"

RPROVIDES:${PN} += "firmware-nvidia/535.86.05/gsp-ga10x.bin \
firmware-nvidia/535.86.05/gsp-tu10x.bin \
kernel-firmware-nvidia-gsp-G06 \
multiversion-kernel"

RDEPENDS:${PN} += ""

inherit rpm
