SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-imx8qx-2.8.6-1.1.noarch.rpm"
RPM_HASH = "e172b2cb250a3536eac5cde948d42bb57f73687e23d26ed825d8f99812a477a7c623f771ff22142b159df7f54c635b3fddb25a48fd45887e5b7f0dc1f3c42f46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-imx8qx"
RDEPENDS:${PN} += ""

inherit rpm
