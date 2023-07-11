SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-hikey960-2.8.6-1.2.noarch.rpm"
RPM_HASH = "7a2736a01598206c14b6167376bf8e83b168930977a402f2b1a229105d68fc8f372deaabf69481de2e393b362d65d96ccfb6d0b322376c0e4c9e3b7726e07c56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-hikey960"

RDEPENDS:${PN} += ""

inherit rpm
