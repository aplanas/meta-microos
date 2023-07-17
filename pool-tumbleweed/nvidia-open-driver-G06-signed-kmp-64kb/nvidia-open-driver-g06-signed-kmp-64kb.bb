SUMMARY = "NVIDIA open kernel module driver for GeForce RTX 2000 series and newer"
DESCRIPTION = "This package provides the open-source NVIDIA kernel module driver \
for GeForce RTX 2000 series and newer GPUs."
LICENSE = "GPL-2.0-only & MIT"

PV = "535.54.03_k6.4.2_1"

RPM_NAME = "nvidia-open-driver-G06-signed-kmp-64kb-535.54.03_k6.4.2_1-1.3.aarch64.rpm"
RPM_HASH = "b49d24a581aacb0e46cb85b96ea0f7fffc71c53138c5bc98964f4aae855d7cc3a19443d8f57f77feb1f5945552f15dcd8683529b8df88bed55de39505a795310"

RPROVIDES:${PN} += "config-nvidia-open-driver-G06-signed-kmp-64kb \
kmod-nvidia-drm.ko \
kmod-nvidia-modeset.ko \
kmod-nvidia-peermem.ko \
kmod-nvidia-uvm.ko \
kmod-nvidia.ko \
multiversion-kernel \
nvidia-open-driver-G06-signed-kmp \
nvidia-open-driver-G06-signed-kmp-64kb \
nvidia-open-driver-G06-signed-kmp-64kb-k6.4.2-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
group-video \
kernel-firmware-nvidia-gsp-G06 \
kernel-uname-r \
perl-Bootloader \
suse-kernel-rpm-scriptlets"

inherit rpm
