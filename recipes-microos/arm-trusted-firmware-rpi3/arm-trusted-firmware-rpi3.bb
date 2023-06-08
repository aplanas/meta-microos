SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-rpi3-2.8.6-1.1.noarch.rpm"
RPM_HASH = "2080cbbf801716778da01793726b23964115f4fd5a3e3dfa75262c9cebc169130642ffbd0b408be62d8abcabca66ec6664e682ce88967ded2e9962d45829f93b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-rpi3"
RDEPENDS:${PN} += "/bin/sh"

inherit rpm
