SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-fvp-2.8.6-1.1.noarch.rpm"
RPM_HASH = "803cf8789ba811f9132ed726bfa4288f0d040e0f1a3c038f88762c2f106412ce851e5687eedc3dc3f17e0b34c5d49eaeb71b84dc9d39f24d4d68bd901f1af6f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-fvp"

RDEPENDS:${PN} += ""

inherit rpm
