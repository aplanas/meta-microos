SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-a3700-2.8.6-1.1.noarch.rpm"
RPM_HASH = "bcc5e6e7ec749b939f7f9c6abe0bc909676eea44f7e01cfd582ed2c20216c72aeae0609faa4fb9bca8bd45795ae056a1b86bb53498ef3dd165257b7719b0e856"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-a3700"
RDEPENDS:${PN} += ""

inherit rpm
