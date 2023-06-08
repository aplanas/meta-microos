SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-rk3328-2.8.6-1.1.noarch.rpm"
RPM_HASH = "2ee2719f081f68782e0b4dc4475b169b0720c8389e479dfb85b0b40f85a30ba1f1b14822ee2756cbb2f51772ee155ea25930613491d016f38f772f63f216b575"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-rk3328"
RDEPENDS:${PN} += ""

inherit rpm
