SUMMARY = "Kernel firmware file for open NVIDIA kernel module driver G06"
DESCRIPTION = "This package contains the versioned kernel firmware file 'gsp.bin' for \
the OpenSource NVIDIA kernel module driver G06."
LICENSE = "GPL-2.0-only & SUSE-Firmware & GPL-2.0-or-later & MIT"

PV = "535.86.05"

RPM_NAME = "kernel-firmware-nvidia-gspx-G06-535.86.05-1.1.aarch64.rpm"
RPM_HASH = "0309aabe6fa357ee9a3233c276fd16a89012e68d49c15a4d0305a62a440257ffd5b0a9d19b333806917cf6f96e469ccde89205ec9d55ce97c873f9717ad3e05f"

RPROVIDES:${PN} += "firmware-nvidia/535.86.05/gsp-ga10x.bin \
firmware-nvidia/535.86.05/gsp-tu10x.bin \
kernel-firmware-nvidia-gspx-G06 \
multiversion-kernel"

RDEPENDS:${PN} += ""

inherit rpm
