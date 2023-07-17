SUMMARY = "NVIDIA open kernel module driver for GeForce RTX 2000 series and newer"
DESCRIPTION = "This package provides the open-source NVIDIA kernel module driver \
for GeForce RTX 2000 series and newer GPUs."
LICENSE = "GPL-2.0-only & MIT"

PV = "535.54.03_k6.4.2_1"

RPM_NAME = "nvidia-open-driver-G06-signed-kmp-default-535.54.03_k6.4.2_1-1.3.aarch64.rpm"
RPM_HASH = "345eef2edc73706bf7e0740da67152ea27323b366ab1868a8ebc35551750292c9ce7fdbcf6c485e584dc4222aed42e4a16a56d3c6cfcffa4c048bb7b06f2c825"

RPROVIDES:${PN} += "config-nvidia-open-driver-G06-signed-kmp-default \
kmod-nvidia-drm.ko \
kmod-nvidia-modeset.ko \
kmod-nvidia-peermem.ko \
kmod-nvidia-uvm.ko \
kmod-nvidia.ko \
multiversion-kernel \
nvidia-open-driver-G06-signed-kmp \
nvidia-open-driver-G06-signed-kmp-default \
nvidia-open-driver-G06-signed-kmp-default-k6.4.2-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
group-video \
kernel-firmware-nvidia-gsp-G06 \
kernel-uname-r \
perl-Bootloader \
suse-kernel-rpm-scriptlets"

inherit rpm
