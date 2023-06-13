SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-tegra210-2.8.6-1.1.noarch.rpm"
RPM_HASH = "5fd8535f901ce4da85ba7198f73018b523769a1878da4ff0a657088a91ba0d2fc47764ff8c65088d1f633c1df0764889ee6984ca72931bc619b849ead12e3b53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-tegra210"

RDEPENDS:${PN} += ""

inherit rpm
