SUMMARY = "Compatibility metapackage for kernel firmware files"
DESCRIPTION = "This package is a catch-all compatibility metapackage for providing \
all files that have been provided by kernel-firmware package."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230814"

RPM_NAME = "kernel-firmware-all-20230814-1.1.noarch.rpm"
RPM_HASH = "7cb035cb6ad07fd36b06122893fedd6bfecc7d3c25541f849028de3cf2117461bb13b477f8d4946fc8240941fd7f98c3c2a72c9d0fe9492aa38d0cbf08d85cde"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compat-wireless-firmware \
kernel-firmware \
kernel-firmware-all"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
dracut \
kernel-firmware-amdgpu \
kernel-firmware-ath10k \
kernel-firmware-ath11k \
kernel-firmware-atheros \
kernel-firmware-bluetooth \
kernel-firmware-bnx2 \
kernel-firmware-brcm \
kernel-firmware-chelsio \
kernel-firmware-dpaa2 \
kernel-firmware-i915 \
kernel-firmware-intel \
kernel-firmware-iwlwifi \
kernel-firmware-liquidio \
kernel-firmware-marvell \
kernel-firmware-media \
kernel-firmware-mediatek \
kernel-firmware-mellanox \
kernel-firmware-mwifiex \
kernel-firmware-network \
kernel-firmware-nfp \
kernel-firmware-nvidia \
kernel-firmware-platform \
kernel-firmware-prestera \
kernel-firmware-qcom \
kernel-firmware-qlogic \
kernel-firmware-radeon \
kernel-firmware-realtek \
kernel-firmware-serial \
kernel-firmware-sound \
kernel-firmware-ti \
kernel-firmware-ueagle \
kernel-firmware-usb-network"

inherit rpm
