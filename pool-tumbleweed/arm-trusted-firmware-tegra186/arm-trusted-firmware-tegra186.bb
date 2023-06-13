SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-tegra186-2.8.6-1.1.noarch.rpm"
RPM_HASH = "1cf81639528aa3f60b54626d4c87d0fa8bcba309b010dec7b893f9587a10b3b4df3057cf6b8acadb1d8384e3751a7050b1b0303c02cf2dbdfdeaf66e35dde23e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-tegra186"

RDEPENDS:${PN} += ""

inherit rpm
