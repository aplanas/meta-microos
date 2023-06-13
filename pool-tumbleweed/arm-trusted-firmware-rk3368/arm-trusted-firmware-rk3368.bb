SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-rk3368-2.8.6-1.1.noarch.rpm"
RPM_HASH = "c1440f13d9b9820d17b5b3b92e8dfb4d5d592b061ae727c55bb82d3e8d10d3d676ec042e7e09b014fb1cd7674fa6f214bc4a577c9a307441c284a85927e2d93e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-rk3368"

RDEPENDS:${PN} += ""

inherit rpm
