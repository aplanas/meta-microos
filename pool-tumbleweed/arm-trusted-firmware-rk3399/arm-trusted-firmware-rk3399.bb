SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-rk3399-2.8.6-1.1.noarch.rpm"
RPM_HASH = "5b4c5e96facd3ee9b6acd4bc6bb21aa0fc694ae09631e1e5d1b62460970405b27c0faff930540f9059eb15641d4489a6c2d7b05a5966dd2683a1ccf51ff5dc10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-rk3399"

RDEPENDS:${PN} += ""

inherit rpm
