SUMMARY = "Scalable algorithms for solving linear systems of equations"
DESCRIPTION = "Hypre is a library of preconditioners that feature parallel multigrid \
methods for both structured and unstructured grid problems arising in \
the simulation codes being developed at LLNL to study physical \
phenomena in the defense, environmental, energy, and biological \
sciences. \
 \
This package contains mvapich2 shared libraries of Hypre."
LICENSE = "Apache-2.0 | MIT"

PV = "2.20.0"

RPM_NAME = "libHYPRE2_20_0-mvapich2-2.20.0-1.9.aarch64.rpm"
RPM_HASH = "a9797710eecdde2a392bb32baf01f39864ab27974bbb8cb79357fed83a3975e50558f3aa0946303950038821fea5fa39379b66d4840a84588b62b5798bb1af2b"

RPROVIDES:${PN} += "libHYPRE.so.2.20.0()(64bit) \
libHYPRE2_20_0-mvapich2 \
libHYPRE2_20_0-mvapich2(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libmpi.so.12()(64bit)"

inherit rpm
