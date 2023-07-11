SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-poplar-2.8.6-1.2.noarch.rpm"
RPM_HASH = "df1c7b05a8ed7c75f9c47ef07be150b6055b80070bd41803c84ae77684d8c9bc224a9b60acd8f8847784349225320fa5da6191a16deee6219505dcf777ee06dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-poplar"

RDEPENDS:${PN} += ""

inherit rpm
