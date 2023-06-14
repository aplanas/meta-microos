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

RPM_NAME = "arprec-devel-2.2.17-2.27.aarch64.rpm"
RPM_HASH = "81350c9a915f71b187f92a6d255b7af12ce5697cabb253cb076b78a86d3161f02e392c858e31a4ae5806d3659ecc0553ab6a10c9e34874f730429a32146a0dea"

RPROVIDES:${PN} += "arprec-devel"

RDEPENDS:${PN} += "/bin/sh \
libarprec0"

inherit rpm
