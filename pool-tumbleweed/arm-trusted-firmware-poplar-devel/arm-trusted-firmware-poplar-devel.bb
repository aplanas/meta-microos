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

RPM_NAME = "arm-trusted-firmware-poplar-devel-2.8.6-1.1.noarch.rpm"
RPM_HASH = "60e257b9801f78df4734bbbd882a8f75a492e9984ad114868e0c5f8af280920781f4a0778353ae7d632c8756b82521fb8b836b5dbe99e37008856e90c32537a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-poplar-devel"

RDEPENDS:${PN} += "arm-trusted-firmware-poplar"

inherit rpm
