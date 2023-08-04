SUMMARY = "Kernel firmware file for open NVIDIA kernel module driver G06"
DESCRIPTION = "This package contains the versioned kernel firmware file 'gsp.bin' for \
the OpenSource NVIDIA kernel module driver G06."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "535.86.05"

RPM_NAME = "kernel-firmware-nvidia-gsp-G06-535.86.05-2.1.aarch64.rpm"
RPM_HASH = "6dbbacad59a60d0c9ab6843fbc3ca10da17df2fd32889f999821f269bda4d02cd3027ed0baad35737e6cb37c43ff9cce18a13af540a15217f4060e457e530789"

RPROVIDES:${PN} += "firmware-nvidia/535.86.05/gsp-ga10x.bin \
firmware-nvidia/535.86.05/gsp-tu10x.bin \
kernel-firmware-nvidia-gsp-G06 \
multiversion-kernel"

RDEPENDS:${PN} += ""

inherit rpm
