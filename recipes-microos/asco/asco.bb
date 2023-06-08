SUMMARY = "A SPICE Circuit Optimizer"
DESCRIPTION = "ASCO project aims to bring circuit optimization capabilities to existing SPICE \
simulators using a high-performance parallel differential evolution (DE) optimization \
algorithm. Currently out-of-the-box support for Eldo (TM), HSPICE (R), LTspice (TM), \
Spectre (R), Qucs and ngspice exist."
LICENSE = "GPL-2.0-only"

PV = "0.4.11"

RPM_NAME = "asco-0.4.11-1.7.aarch64.rpm"
RPM_HASH = "423970055a9b04411e6061ac7964fc0ed027c022fd2e5a6e750a4ab6627409d19d1e20c932ce2b4304e9fa2e04c121a517e78ff1fcf51d93f7b12b93792253ea"

RPROVIDES:${PN} += "asco asco(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit)"

inherit rpm
