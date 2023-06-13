SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-imx8mm-2.8.6-1.1.noarch.rpm"
RPM_HASH = "b389faec4f6a3f33c1e6a9e96a965d4d886ad7464d8d722b34acb31dd4ed351f04eafec680d65cde44deb283d9a91d95ea4af4f2cd1b3446de29c8bb5001ab33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-imx8mm"

RDEPENDS:${PN} += ""

inherit rpm
