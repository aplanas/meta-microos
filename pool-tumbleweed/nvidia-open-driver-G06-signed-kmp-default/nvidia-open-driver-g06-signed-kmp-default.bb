SUMMARY = "NVIDIA open kernel module driver for GeForce RTX 2000 series and newer"
DESCRIPTION = "This package provides the open-source NVIDIA kernel module driver \
for GeForce RTX 2000 series and newer GPUs."
LICENSE = "GPL-2.0-only & MIT"

PV = "535.54.03_k6.4.3_1"

RPM_NAME = "nvidia-open-driver-G06-signed-kmp-default-535.54.03_k6.4.3_1-1.4.aarch64.rpm"
RPM_HASH = "da1685a80bfa0d637772cab1986932cf672df13883b70a473aede464bfab9dbdb6dcf13aeae9f4d325d25b03d6f12baf68e9cb2f5ada479f42a05873cebbac43"

RPROVIDES:${PN} += "config-nvidia-open-driver-G06-signed-kmp-default \
kmod-nvidia-drm.ko \
kmod-nvidia-modeset.ko \
kmod-nvidia-peermem.ko \
kmod-nvidia-uvm.ko \
kmod-nvidia.ko \
multiversion-kernel \
nvidia-open-driver-G06-signed-kmp \
nvidia-open-driver-G06-signed-kmp-default \
nvidia-open-driver-G06-signed-kmp-default-k6.4.3-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
group-video \
kernel-firmware-nvidia-gsp-G06 \
kernel-uname-r \
perl-Bootloader \
suse-kernel-rpm-scriptlets"

inherit rpm
