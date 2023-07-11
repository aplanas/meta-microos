SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-2.8.6-1.2.aarch64.rpm"
RPM_HASH = "9f51eab0a6c66763381b57a1aad0b4e8d6748c542a79ebbd549a39fee6adab85466fa04e5cfda2757f893de572e6c4305c6da23bbd45f6188dc1da603d7b6ced"

RPROVIDES:${PN} += "arm-trusted-firmware"

RDEPENDS:${PN} += ""

inherit rpm
