SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-a80x0_mcbin-2.8.6-1.1.noarch.rpm"
RPM_HASH = "a9b6b8fe626cac9312ec994f84549e3f111eccc7bcc8d1ac00ce4582076395ee7133de649c817e6e945324c87a26027f7fe58822c4f46eaeee32ce65d30820e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-a80x0_mcbin"

RDEPENDS:${PN} += ""

inherit rpm
