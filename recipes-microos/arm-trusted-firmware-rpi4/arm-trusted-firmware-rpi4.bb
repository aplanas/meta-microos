SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-rpi4-2.8.6-1.1.noarch.rpm"
RPM_HASH = "4fdae2f6fe287d89271b0fdb4c9324fb501d567e797d5b6ffac51e99d09f23dd1b0f42c09ecbdbf5702aa78701d35f6f0f36d00ef4d011b47621e288ee01f4f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-rpi4"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
