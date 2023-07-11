SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-fvp-2.8.6-1.2.noarch.rpm"
RPM_HASH = "622bd4ef931f0ced4c4d01875a05766e8fec17dcc1ae2c158e490451d38599cac273c1fc1cf3b835176c700d58865631f04445a9d997a4a5339431d322a01738"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-fvp"

RDEPENDS:${PN} += ""

inherit rpm
