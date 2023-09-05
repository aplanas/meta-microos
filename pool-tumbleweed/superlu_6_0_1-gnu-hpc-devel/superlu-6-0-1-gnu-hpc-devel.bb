SUMMARY = "Headers and development library for libsuperlu_6_0_1-gnu-hpc"
DESCRIPTION = "SuperLU headers and libraries files needed for development 1"
LICENSE = "BSD-3-Clause"

PV = "6.0.1"

RPM_NAME = "superlu_6_0_1-gnu-hpc-devel-6.0.1-1.1.aarch64.rpm"
RPM_HASH = "01b31f1bb36927bb33ebdc98079c0fbc55bccda5d87c112871b8f027d3e690f0978944d1ceabe0d6b00ca6f422e28cdc9eb0eec63bc293c53e7e8d90fe33886f"

RPROVIDES:${PN} += "superlu-6-0-1-gnu-hpc-devel"

RDEPENDS:${PN} += "gnu-compilers-hpc-devel \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libopenblas-gnu-hpc-devel \
libsuperlu-6-0-1-gnu-hpc"

inherit rpm
