SUMMARY = "NVIDIA open kernel module driver for GeForce RTX 2000 series and newer"
DESCRIPTION = "This package provides the open-source NVIDIA kernel module driver \
for GeForce RTX 2000 series and newer GPUs."
LICENSE = "GPL-2.0-only & MIT"

PV = "535.54.03_k6.3.9_1"

RPM_NAME = "nvidia-open-driver-G06-signed-kmp-64kb-535.54.03_k6.3.9_1-1.2.aarch64.rpm"
RPM_HASH = "4864a2cfd4a734e0bb47481ecd81e39a7a39f29784fa35ef191fb2a499413ec7c47e7635ffe257a9aedd52116fd1043caee57e3c5f2ff5c4f9a01337691d8869"

RPROVIDES:${PN} += "config-nvidia-open-driver-G06-signed-kmp-64kb \
kmod-nvidia-drm.ko \
kmod-nvidia-modeset.ko \
kmod-nvidia-peermem.ko \
kmod-nvidia-uvm.ko \
kmod-nvidia.ko \
multiversion-kernel \
nvidia-open-driver-G06-signed-kmp \
nvidia-open-driver-G06-signed-kmp-64kb \
nvidia-open-driver-G06-signed-kmp-64kb-k6.3.9-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
group-video \
kernel-firmware-nvidia-gsp-G06 \
kernel-uname-r \
perl-Bootloader \
suse-kernel-rpm-scriptlets"

inherit rpm
