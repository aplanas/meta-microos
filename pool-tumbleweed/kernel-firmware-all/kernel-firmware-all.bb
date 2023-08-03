SUMMARY = "Compatibility metapackage for kernel firmware files"
DESCRIPTION = "This package is a catch-all compatibility metapackage for providing \
all files that have been provided by kernel-firmware package."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230724"

RPM_NAME = "kernel-firmware-all-20230724-1.1.noarch.rpm"
RPM_HASH = "eca0ae685fcafe985829d858b0a6a35d99a7303e1d26d6c9bad662c2845648fec53b5d245981f816d952145a67debb34c2d478a02ac0fa03590cc215effe2b3b"
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
