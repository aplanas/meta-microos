SUMMARY = "Kernel firmware file for open NVIDIA kernel module driver G06"
DESCRIPTION = "This package contains the versioned kernel firmware file 'gsp.bin' for \
the OpenSource NVIDIA kernel module driver G06."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "525.116.04"

RPM_NAME = "kernel-firmware-nvidia-gsp-G06-525.116.04-2.1.aarch64.rpm"
RPM_HASH = "b0fd51b9524e89fdcd8eb9e2d8f92c1a0c44e544ec250e785dfabde8b3917c81fc8a0566bb71ee33518ac200d91fb6f629fde78947d3f1ad03a7ab31305ef1b1"

RPROVIDES:${PN} += "firmware-nvidia/525.116.04/gsp-ad10x.bin \
firmware-nvidia/525.116.04/gsp-tu10x.bin \
kernel-firmware-nvidia-gsp-G06 \
multiversion-kernel"

RDEPENDS:${PN} += ""

inherit rpm
