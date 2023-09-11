SUMMARY = "Kernel firmware file for open NVIDIA kernel module driver G06"
DESCRIPTION = "This package contains the versioned kernel firmware file 'gsp.bin' for \
the OpenSource NVIDIA kernel module driver G06."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "535.104.05"

RPM_NAME = "kernel-firmware-nvidia-gspx-G06-535.104.05-1.1.aarch64.rpm"
RPM_HASH = "1dd737123fd19a2f19a9b07f5539ee6b2c6bad199e472fca450d4408a74eebc949e8947f2c4afa8b7c9bdf7e635e12e61fea0dc8b9798ab6745c379a408c39d3"

RPROVIDES:${PN} += "firmware-nvidia/535.104.05/gsp-ga10x.bin \
firmware-nvidia/535.104.05/gsp-tu10x.bin \
kernel-firmware-nvidia-gspx-G06 \
multiversion-kernel"

RDEPENDS:${PN} += ""

inherit rpm
