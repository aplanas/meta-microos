SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-qemu_sbsa-2.8.6-1.1.noarch.rpm"
RPM_HASH = "e56b94e8d4fecd1280dd35bff3f3230b02304146c1ad6bf2e3345ec8b8b29e345cbcd10253e79703415995dcf55e91f3897d545b87298a95c3300f26d93c6fa2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-qemu-sbsa"

RDEPENDS:${PN} += ""

inherit rpm
