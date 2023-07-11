SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-rpi3-2.8.6-1.2.noarch.rpm"
RPM_HASH = "22b52143ff4ca694df1fa2a761e60afee52e826b9a99ce11dfeb1dd4a5186b9bd0551147772e9fe941e6d9c265c1ee18303ea2c1639193155fe8e368b50915b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-rpi3"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
