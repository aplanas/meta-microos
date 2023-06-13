SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-hikey-2.8.6-1.1.noarch.rpm"
RPM_HASH = "c2ef8432f9236b0b2596c6f71d232cadb908cb24320c5a87200560aa1eb6e50eccc20af9c3d8d093546fe6b1d211fcf11fcc52aa7b5b55132dd1da9ecd940582"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-hikey"

RDEPENDS:${PN} += ""

inherit rpm
