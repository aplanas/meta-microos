SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-a3700-2.8.6-1.2.noarch.rpm"
RPM_HASH = "d36c15c4badb0e843d993239de284ba3a1fc88601e6d09608d86785972bf2205b830912fb7e571b8fb6fd0861600affcca47f8a9c322c9cbc4c0e69829cdc181"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-a3700"

RDEPENDS:${PN} += ""

inherit rpm
