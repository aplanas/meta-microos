SUMMARY = "Kernel firmware file for open NVIDIA kernel module driver G06"
DESCRIPTION = "This package contains the versioned kernel firmware file 'gsp.bin' for \
the OpenSource NVIDIA kernel module driver G06."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "535.54.03"

RPM_NAME = "kernel-firmware-nvidia-gsp-G06-535.54.03-1.1.aarch64.rpm"
RPM_HASH = "59e6a775cbbfe94c41bfbe6cd59bb41fcc8272441c31b15cdded5cfc3c6e2bcd40eafccbb14741789ce105fd6498e3e24bca0c56c5daf4c235e29b9b6d44315c"

RPROVIDES:${PN} += "firmware-nvidia/535.54.03/gsp-ga10x.bin \
firmware-nvidia/535.54.03/gsp-tu10x.bin \
kernel-firmware-nvidia-gsp-G06 \
multiversion-kernel"

RDEPENDS:${PN} += ""

inherit rpm
