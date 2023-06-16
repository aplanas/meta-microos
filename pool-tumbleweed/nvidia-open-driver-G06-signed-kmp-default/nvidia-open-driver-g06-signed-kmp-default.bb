SUMMARY = "NVIDIA open kernel module driver for GeForce RTX 2000 series and newer"
DESCRIPTION = "This package provides the open-source NVIDIA kernel module driver \
for GeForce RTX 2000 series and newer GPUs."
LICENSE = "GPL-2.0-only & MIT"

PV = "525.116.04_k6.3.4_1"

RPM_NAME = "nvidia-open-driver-G06-signed-kmp-default-525.116.04_k6.3.4_1-1.4.aarch64.rpm"
RPM_HASH = "691d092cf791be2e5cb3270c01f580ed0be1ea404633b602cfa5d4b0b2b66f1d47a7b4d1617068c100c880b9f02a69e74f601d25743ad87bc0cb5c6840c9a58b"

RPROVIDES:${PN} += "config-nvidia-open-driver-G06-signed-kmp-default \
kmod-nvidia-drm.ko \
kmod-nvidia-modeset.ko \
kmod-nvidia-peermem.ko \
kmod-nvidia-uvm.ko \
kmod-nvidia.ko \
multiversion-kernel \
nvidia-open-driver-G06-signed-kmp \
nvidia-open-driver-G06-signed-kmp-default \
nvidia-open-driver-G06-signed-kmp-default-k6.3.4-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
group-video \
kernel-firmware-nvidia-gsp-G06 \
kernel-uname-r \
perl-Bootloader \
suse-kernel-rpm-scriptlets"

inherit rpm
