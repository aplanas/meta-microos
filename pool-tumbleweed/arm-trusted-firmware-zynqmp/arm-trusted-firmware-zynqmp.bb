SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-zynqmp-2.8.6-1.1.noarch.rpm"
RPM_HASH = "eac879bf0092f25478b9704b96e2e56310f6f9134c06e3783eca5412105eda051f1c13984004d23515e2f33dc224d371449e2bd7a330c72456caf8814b2ce11d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-zynqmp"
RDEPENDS:${PN} += ""

inherit rpm
