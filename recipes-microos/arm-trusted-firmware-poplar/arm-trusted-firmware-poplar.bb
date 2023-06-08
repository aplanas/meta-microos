SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-poplar-2.8.6-1.1.noarch.rpm"
RPM_HASH = "c0653e4f8456a78e8d37b5e8044f6e3fe855121c89c59d973f6eb56da2a24b9962bc16e0ec147478ee54a87b351253d71bcd4b7ac9961f4b1f192a93ac96ae31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-poplar"
RDEPENDS:${PN} += ""

inherit rpm
