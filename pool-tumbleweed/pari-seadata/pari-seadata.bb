SUMMARY = "Polynomial and Elliptic Curve Data for the PARI CAS"
DESCRIPTION = "This package is needed by the 'ellap' function of the PARI CAS for \
large primes. The second one is a much smaller version that should be \
suitable for primes up to 350 bits. These polynomials were extracted \
from the ECHIDNA databases and computed by David R. Kohel."
LICENSE = "GPL-2.0-or-later"

PV = "20090618"

RPM_NAME = "pari-seadata-20090618-10.3.noarch.rpm"
RPM_HASH = "8a1a9c7c01f432d161d1804dd5ce92fb542f3e7bf81bab985c4c3cc929e685c8035637168e1e3cb5f47773476b75abc5bd492e5f2b13345687a00adc2ebda249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pari-seadata"

RDEPENDS:${PN} += ""

inherit rpm
