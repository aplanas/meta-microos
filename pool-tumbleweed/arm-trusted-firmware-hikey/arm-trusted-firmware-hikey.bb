SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-hikey-2.8.6-1.2.noarch.rpm"
RPM_HASH = "810caaa07616891222a1d750d12aaf563f19e7e852ac8fc5493154d6c833c755a1c650d19f80ff726d12cd391249f978c8c7edc5b76b3f2fb82054dd37cbca3d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-hikey"

RDEPENDS:${PN} += ""

inherit rpm
