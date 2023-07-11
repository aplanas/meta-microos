SUMMARY = "Development files for the ARbitrary PRECision Computation library"
DESCRIPTION = "ARPREC is a software package for performing arbitrary precision \
arithmetic. It consists of a revision and extension of Bailey's \
earlier MPFUN package, enhanced with special IEEE numerical \
techniques. \
 \
The arprec-devel package contains libraries and header files for \
developing applications that use arprec."
LICENSE = "BSD-3-Clause"

PV = "2.2.17"

RPM_NAME = "arprec-devel-2.2.17-2.28.aarch64.rpm"
RPM_HASH = "afa559e6ddec95d72b8008982a1b0f7346021413f0c9e88c2694bab60dfa39abac77636d086bd17119273f5b99efb45ccbb24af3212fa8788f541bc308691152"

RPROVIDES:${PN} += "arprec-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libarprec0"

inherit rpm
