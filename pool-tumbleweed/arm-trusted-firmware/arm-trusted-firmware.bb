SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-2.8.6-1.1.aarch64.rpm"
RPM_HASH = "c32429f1022a0e0144ace6de981262d18163464c912488d837aeebaba7b3452eed18e118797c3121ddb4674b27614e9d6eb44d48d07efb36d58726b80e1feeee"

RPROVIDES:${PN} += "arm-trusted-firmware"

RDEPENDS:${PN} += ""

inherit rpm
