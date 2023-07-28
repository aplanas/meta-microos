SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-2.8.6-1.3.aarch64.rpm"
RPM_HASH = "c970e9961a72ccb1378e346a69f56cfa77f225dee13f51fd36704320906f0a77470b8d251701773b6243f039ae1e03eaf9c620f9062d9d09109e10d18669f4db"

RPROVIDES:${PN} += "arm-trusted-firmware"

RDEPENDS:${PN} += ""

inherit rpm
