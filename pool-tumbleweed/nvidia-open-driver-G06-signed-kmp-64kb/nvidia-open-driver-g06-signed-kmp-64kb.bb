SUMMARY = "NVIDIA open kernel module driver for GeForce RTX 2000 series and newer"
DESCRIPTION = "This package provides the open-source NVIDIA kernel module driver \
for GeForce RTX 2000 series and newer GPUs."
LICENSE = "GPL-2.0-only & MIT"

PV = "535.86.05_k6.4.6_1"

RPM_NAME = "nvidia-open-driver-G06-signed-kmp-64kb-535.86.05_k6.4.6_1-3.1.aarch64.rpm"
RPM_HASH = "16ef360a8c6b40bc3cd17318b6366878bff02feba87cc02890f7e61143a1cf561312b430c8c73ce5e3a71c9bdd705181a7569791929ff5c7fec209fc686bbc59"

RPROVIDES:${PN} += "config-nvidia-open-driver-G06-signed-kmp-64kb \
kmod-nvidia-drm.ko \
kmod-nvidia-modeset.ko \
kmod-nvidia-peermem.ko \
kmod-nvidia-uvm.ko \
kmod-nvidia.ko \
multiversion-kernel \
nvidia-open-driver-G06-signed-kmp \
nvidia-open-driver-G06-signed-kmp-64kb \
nvidia-open-driver-G06-signed-kmp-64kb-k6.4.6-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
group-video \
kernel-firmware-nvidia-gspx-G06 \
kernel-uname-r \
perl-Bootloader \
suse-kernel-rpm-scriptlets"

inherit rpm
