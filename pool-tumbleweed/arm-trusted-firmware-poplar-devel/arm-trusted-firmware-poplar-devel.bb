SUMMARY = "ARM Trusted Firmware -- poplar development files"
DESCRIPTION = "ARM Trusted Firmware provides a reference implementation of \
secure world software for ARMv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3). It implements various ARM interface standards, \
such as the Power State Coordination Interface (PSCI), \
Trusted Board Boot Requirements (TBBR, ARM DEN0006C-1) and \
SMC Calling Convention. As far as possible the code is designed for reuse \
or porting to other ARMv8-A model and hardware platforms. \
 \
This sub-package contains development files."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-poplar-devel-2.8.6-1.2.noarch.rpm"
RPM_HASH = "34331eafa392078c0923374384ce9fb85a51ec985779b393981b7b11a1a0686d839a399fe7b8659aec1b5877d6d0ad5cca308dfc74340cb6ce177246c85fcd5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-poplar-devel"

RDEPENDS:${PN} += "arm-trusted-firmware-poplar"

inherit rpm
