SUMMARY = "Python implementation of the 'Circuit Breaker' Pattern"
DESCRIPTION = "Python implementation of the 'Circuit Breaker' Pattern"
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python310-circuitbreaker-1.3.2-1.10.noarch.rpm"
RPM_HASH = "1f14e70082fc70a6c461839a66959409fcb03b982e1aa4b0577d3652b0a000ab419f299188b512ad0ebb1654aa7a8d9c5bda4f99cebe05bd645b2306585f8a3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-circuitbreaker \
python310-circuitbreaker \
python3dist-circuitbreaker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
