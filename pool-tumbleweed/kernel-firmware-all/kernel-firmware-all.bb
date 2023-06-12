SUMMARY = "Compatibility metapackage for kernel firmware files"
DESCRIPTION = "This package is a catch-all compatibility metapackage for providing \
all files that have been provided by kernel-firmware package."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "20230517"

RPM_NAME = "kernel-firmware-all-20230517-1.1.noarch.rpm"
RPM_HASH = "7fbab7d776f0ef5005043363426aa3a0f273b9beb9a50e40fc5367507cccadd3023ee93114067c9b3d4e2f70c197e8a114483b30f35520108d961d3d7d65a2d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compat-wireless-firmware \
kernel-firmware \
kernel-firmware-all"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/mkdir \
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
