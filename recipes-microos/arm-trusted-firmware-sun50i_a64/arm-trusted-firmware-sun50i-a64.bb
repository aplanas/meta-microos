SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-sun50i_a64-2.8.6-1.1.noarch.rpm"
RPM_HASH = "e690e4820ae9cbb32573294bb6569ed30717a952dd4f30119cfcc34e89ba5f770b5fa12fd7b943e3a68d83f9bfc813ec49cfc6c43ed6adcee51b256190974f35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-sun50i_a64"
RDEPENDS:${PN} += ""

inherit rpm
