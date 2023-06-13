SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-qemu-2.8.6-1.1.noarch.rpm"
RPM_HASH = "9c9213b612ea76641eeef8984f32fffa9245a7a7ed7eadf8c16cc8927b6cf388c6684992bca2239006f1517b3984c4b98e2181113068fca07a8d8a6625b09e9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-qemu"

RDEPENDS:${PN} += ""

inherit rpm
