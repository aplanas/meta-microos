SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains serial shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE2_20_0-2.20.0-1.9.aarch64.rpm"
RPM_HASH = "5c449d2205b937e58ca0f24888c987da94ee93ac955997b8756ef029630141dce40465100028d325d7f0376eec07a959bad86afc03dbc7ba8f03fd69b6b239b6"

RPROVIDES:${PN} += "libHYPRE.so.2.20.0()(64bit) \
libHYPRE2_20_0 \
libHYPRE2_20_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
