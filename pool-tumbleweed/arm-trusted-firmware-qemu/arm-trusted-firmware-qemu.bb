SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-qemu-2.8.6-1.2.noarch.rpm"
RPM_HASH = "a11d098f025dc00a3a3d1989700a67c926261db1cce6b9705c93b6b482dcab172a101c752978abbfaa205d1b8a9d73d28a54c69b018ab8f707a7208c3fef53af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-qemu"

RDEPENDS:${PN} += ""

inherit rpm
