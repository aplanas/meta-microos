SUMMARY = "A SPICE Circuit Optimizer"
DESCRIPTION = "ASCO brings circuit optimization capabilities to existing SPICE \
simulators using a parallel differential evolution (DE) optimization \
algorithm. Currently, out-of-the-box support for Eldo, HSPICE, LTspice, \
Spectre, Qucs and ngspice exist."
LICENSE = "GPL-2.0-only"

PV = "0.4.11"

RPM_NAME = "asco-0.4.11-2.1.aarch64.rpm"
RPM_HASH = "dc15e5f9c99d0b74b1405b87297abecf50c656eb6c565cdb189cb624a02225a85b7111ef6963f0373bdf49ffdf28df4fabfb441955c479f676638a83ac41cf88"

RPROVIDES:${PN} += "asco \
asco(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
