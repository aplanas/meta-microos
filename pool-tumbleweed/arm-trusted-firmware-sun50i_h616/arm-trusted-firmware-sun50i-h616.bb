SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-sun50i_h616-2.8.6-1.1.noarch.rpm"
RPM_HASH = "b7b6065b83af97599c5ddf41e791f3096158c907002db6bf706c19687c0c4e68daaf0f8bfe1c22c2a5759eb48e36a376869cd00a619a7463cf2cb042b107cd89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-sun50i_h616"
RDEPENDS:${PN} += ""

inherit rpm
