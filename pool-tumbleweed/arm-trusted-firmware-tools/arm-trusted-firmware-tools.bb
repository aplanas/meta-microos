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

RPM_NAME = "arm-trusted-firmware-tools-2.8.6-1.1.aarch64.rpm"
RPM_HASH = "bc3619835e165b6e56e2da442bbc30635db381a638494c852087ebc68ca3cc26b170064591bd123f340226b1f7812ee800d6d6a0d7a0a573fb19524afe1a08a7"

RPROVIDES:${PN} += "arm-trusted-firmware-tools \
arm-trusted-firmware-tools(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libcryptopp.so.8.7.0()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
