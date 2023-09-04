SUMMARY = "NVIDIA open kernel module driver for GeForce RTX 2000 series and newer"
DESCRIPTION = "This package provides the open-source NVIDIA kernel module driver \
for GeForce RTX 2000 series and newer GPUs."
LICENSE = "GPL-2.0-only & MIT"

PV = "535.86.05_k6.4.11_1"

RPM_NAME = "nvidia-open-driver-G06-signed-kmp-64kb-535.86.05_k6.4.11_1-3.4.aarch64.rpm"
RPM_HASH = "fea4ee46401df61e2ba8a391981d8a5c97eb2cd15c6cf41ee50fa7174a6e657ecdae36422ee89b0b6d0367d8974b345a8f77535733c0278971d9e48207ed7bdd"

RPROVIDES:${PN} += "config-nvidia-open-driver-G06-signed-kmp-64kb \
kmod-nvidia-drm.ko \
kmod-nvidia-modeset.ko \
kmod-nvidia-peermem.ko \
kmod-nvidia-uvm.ko \
kmod-nvidia.ko \
multiversion-kernel \
nvidia-open-driver-G06-signed-kmp \
nvidia-open-driver-G06-signed-kmp-64kb \
nvidia-open-driver-G06-signed-kmp-64kb-k6.4.11-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
group-video \
kernel-firmware-nvidia-gspx-G06 \
kernel-uname-r \
perl-Bootloader \
suse-kernel-rpm-scriptlets"

inherit rpm
