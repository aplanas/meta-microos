SUMMARY = "NVIDIA open kernel module driver for GeForce RTX 2000 series and newer"
DESCRIPTION = "This package provides the open-source NVIDIA kernel module driver \
for GeForce RTX 2000 series and newer GPUs."
LICENSE = "GPL-2.0-only & MIT"

PV = "535.54.03_k6.4.3_1"

RPM_NAME = "nvidia-open-driver-G06-signed-kmp-64kb-535.54.03_k6.4.3_1-1.4.aarch64.rpm"
RPM_HASH = "3ceb0f4bace3a38e66347aca281e9206da61abef6b9eaaba35156f211f37e7a688e689042f0393be5b5b074e750a8234a519304975aa33c4d5aa1ed197dac6b9"

RPROVIDES:${PN} += "config-nvidia-open-driver-G06-signed-kmp-64kb \
kmod-nvidia-drm.ko \
kmod-nvidia-modeset.ko \
kmod-nvidia-peermem.ko \
kmod-nvidia-uvm.ko \
kmod-nvidia.ko \
multiversion-kernel \
nvidia-open-driver-G06-signed-kmp \
nvidia-open-driver-G06-signed-kmp-64kb \
nvidia-open-driver-G06-signed-kmp-64kb-k6.4.3-1"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
grep \
group-video \
kernel-firmware-nvidia-gsp-G06 \
kernel-uname-r \
perl-Bootloader \
suse-kernel-rpm-scriptlets"

inherit rpm
