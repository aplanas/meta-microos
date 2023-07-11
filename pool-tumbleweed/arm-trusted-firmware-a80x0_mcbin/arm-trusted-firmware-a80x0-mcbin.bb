SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-a80x0_mcbin-2.8.6-1.2.noarch.rpm"
RPM_HASH = "17738b5d0bfeebd36813247a78aa65360ae7dcebaf1b9bfadbf12283a8cb2a7de9ed6b46bcd04387e078c2a9cba08d25f4b3fce7e83c2b45d8c2d81063464b6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-a80x0-mcbin"

RDEPENDS:${PN} += ""

inherit rpm
