SUMMARY = "Tools for ARM Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of \
secure world software for ARMv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3). It implements various ARM interface standards, \
such as the Power State Coordination Interface (PSCI), \
Trusted Board Boot Requirements (TBBR, ARM DEN0006C-1) and \
SMC Calling Convention. As far as possible the code is designed for reuse \
or porting to other ARMv8-A model and hardware platforms. \
 \
This package contains fiptool."
LICENSE = "BSD-3-Clause"

PV = "2.8.6"

RPM_NAME = "arm-trusted-firmware-tools-2.8.6-1.3.aarch64.rpm"
RPM_HASH = "6c911eb04359a8c012332606be45cfa7ed9bef20e4e4c1499c2f6e1ac4788bf38e98549f3bba7cd96fc98fd3b77cbf21a19c7962d666c54f28c7aeeca9716874"

RPROVIDES:${PN} += "arm-trusted-firmware-tools"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libcryptopp.so.8.8.0 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
