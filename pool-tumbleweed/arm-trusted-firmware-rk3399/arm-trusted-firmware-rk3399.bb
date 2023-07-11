SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-rk3399-2.8.6-1.2.noarch.rpm"
RPM_HASH = "3e6e326c1fa03d06d66ff0ebf5a1f51ae0d4f498c7d2a5938dc77e75aa1358fb610d6c2c4e2bd444900109829c18586d211890dda38920aad049be6bfca3bcbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
