SUMMARY = "Kernel firmware file for open NVIDIA kernel module driver G06"
DESCRIPTION = "This package contains the versioned kernel firmware file 'gsp.bin' for \
the OpenSource NVIDIA kernel module driver G06."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "535.86.05"

RPM_NAME = "kernel-firmware-nvidia-gsp-G06-535.86.05-3.1.aarch64.rpm"
RPM_HASH = "9c234398e14c9b675c57482d6d1ed9aacf4dcec9c9075fbf0497999d106eb4d5e9d8865942e2c5402ebc75c97d142dff354f77b8fe8c8a04081260269e86cbca"

RPROVIDES:${PN} += "firmware-nvidia/535.86.05/gsp-ga10x.bin \
firmware-nvidia/535.86.05/gsp-tu10x.bin \
kernel-firmware-nvidia-gsp-G06 \
multiversion-kernel"

RDEPENDS:${PN} += ""

inherit rpm
