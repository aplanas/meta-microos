SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-rk3368-2.8.6-1.2.noarch.rpm"
RPM_HASH = "84875e763c8e56080361a8b0850df44ea93f3010c36112ff5745a9210613f66739b902b9e6e187a7ea6e01974b25506c05f2b47e72d032f8d9ba1477dd67e7e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-rk3368"

RDEPENDS:${PN} += ""

inherit rpm
