SUMMARY = "NVIDIA open kernel module driver for GeForce RTX 2000 series and newer"
DESCRIPTION = "This package provides the open-source NVIDIA kernel module driver \
for GeForce RTX 2000 series and newer GPUs."
LICENSE = "GPL-2.0-only & MIT"

PV = "535.86.05_k6.4.6_1"

RPM_NAME = "nvidia-open-driver-G06-signed-kmp-default-535.86.05_k6.4.6_1-3.1.aarch64.rpm"
RPM_HASH = "6f6e8ad9fd552a42a6b16efd1348b1ff798de91f2ae62c66f3f5b093174975d2537ff68a7ad129dcd742e9b91b4a3e728ed0bd19bc7a7a346574b2183873afe8"

RPROVIDES:${PN} += "config-nvidia-open-driver-G06-signed-kmp-default \
kmod-nvidia-drm.ko \
kmod-nvidia-modeset.ko \
kmod-nvidia-peermem.ko \
kmod-nvidia-uvm.ko \
kmod-nvidia.ko \
multiversion-kernel \
nvidia-open-driver-G06-signed-kmp \
nvidia-open-driver-G06-signed-kmp-default \
nvidia-open-driver-G06-signed-kmp-default-k6.4.6-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
group-video \
kernel-firmware-nvidia-gspx-G06 \
kernel-uname-r \
perl-Bootloader \
suse-kernel-rpm-scriptlets"

inherit rpm
