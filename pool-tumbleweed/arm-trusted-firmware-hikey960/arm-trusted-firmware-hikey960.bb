SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-hikey960-2.8.6-1.1.noarch.rpm"
RPM_HASH = "cf0df4035ffd51e193a2eead3ad685075d53fa423c378701b98c28bb3f65223feb028efbc2f81b3fe6265ff2817d8c3415bb2104eb8d0f240f8d9648abd86dca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-hikey960"

RDEPENDS:${PN} += ""

inherit rpm
