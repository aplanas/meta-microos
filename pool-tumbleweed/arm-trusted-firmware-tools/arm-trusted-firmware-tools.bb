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

RPM_NAME = "arm-trusted-firmware-tools-2.8.6-1.2.aarch64.rpm"
RPM_HASH = "11a626fa3133c986250d71bd5189a9b1925cd0941d7493af14be17cea6bc5f2f2014556eb144905c44afb28682c9811a42fd88e5e8cc844f883a51f084b5d224"

RPROVIDES:${PN} += "arm-trusted-firmware-tools"

RDEPENDS:${PN} += "libc.so.6 \
libcrypto.so.3 \
libcryptopp.so.8.7.0 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
