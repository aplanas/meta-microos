SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-imx8mq-2.8.6-1.1.noarch.rpm"
RPM_HASH = "c03094b423fc463730fe82de451d75474f6302e9ab3af8a58595f06eafa59f2c49feb89756556e676c430849e961e6589f4038e6ec739b4a1454d76341a4ea44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-imx8mq"

RDEPENDS:${PN} += ""

inherit rpm
