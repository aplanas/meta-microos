SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-sun50i_h6-2.8.6-1.1.noarch.rpm"
RPM_HASH = "5c44ba19bf6b3a8b21b07bda5902768c49299f4f9a6e910018d6d4e8459bb79cd4269c10dee65a2e6954b77edc99fafa1bd8fbd84ab111a30f447631d66b65de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-sun50i_h6"
RDEPENDS:${PN} += ""

inherit rpm
