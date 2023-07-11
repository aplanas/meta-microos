SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-rk3328-2.8.6-1.2.noarch.rpm"
RPM_HASH = "e66ea40cd9fe2d54c260f8b2dbbaacc57c4b6d5f2239987f96dbbd09ca7a8e81b0107f62e4149b58d4063f5b9bdaedcebcbd127d93ee2aa8b621be9f32cac9cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-rk3328"

RDEPENDS:${PN} += ""

inherit rpm
