SUMMARY = "NVIDIA open kernel module driver for GeForce RTX 2000 series and newer"
DESCRIPTION = "This package provides the open-source NVIDIA kernel module driver \
for GeForce RTX 2000 series and newer GPUs."
LICENSE = "GPL-2.0-only & MIT"

PV = "535.86.05_k6.4.11_1"

RPM_NAME = "nvidia-open-driver-G06-signed-kmp-default-535.86.05_k6.4.11_1-3.4.aarch64.rpm"
RPM_HASH = "ac0232a7b970cc7ec2e545455e99ae3f1efb66aaeba350cb556e153a1b68326667801bd4e3d78add066ecfb88b8365d6bec42bfce695e45df5970b7f4adb27b1"

RPROVIDES:${PN} += "config-nvidia-open-driver-G06-signed-kmp-default \
kmod-nvidia-drm.ko \
kmod-nvidia-modeset.ko \
kmod-nvidia-peermem.ko \
kmod-nvidia-uvm.ko \
kmod-nvidia.ko \
multiversion-kernel \
nvidia-open-driver-G06-signed-kmp \
nvidia-open-driver-G06-signed-kmp-default \
nvidia-open-driver-G06-signed-kmp-default-k6.4.11-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
group-video \
kernel-firmware-nvidia-gspx-G06 \
kernel-uname-r \
perl-Bootloader \
suse-kernel-rpm-scriptlets"

inherit rpm
