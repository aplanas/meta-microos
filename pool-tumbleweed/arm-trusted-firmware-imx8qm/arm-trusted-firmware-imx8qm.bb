SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-imx8qm-2.8.6-1.1.noarch.rpm"
RPM_HASH = "b724c496c113805ff1a3a892d0b0f9464f2091a17c5494643bf279c2f79c831f35450251c42f2de708606e164911fdebb6ad8f48801eb543d9ce55868a9c45ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-imx8qm"

RDEPENDS:${PN} += ""

inherit rpm
