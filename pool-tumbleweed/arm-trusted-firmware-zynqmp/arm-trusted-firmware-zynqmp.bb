SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-zynqmp-2.8.6-1.2.noarch.rpm"
RPM_HASH = "03dfeda99f0256e8637b30f18f0c6901246940e4e15d49731afefc0e8505e42d32c387e2e94513cee5998e1ae1c6a194d42cd452fd3e744f40af43449383b5e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-zynqmp"

RDEPENDS:${PN} += ""

inherit rpm
