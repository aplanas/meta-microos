SUMMARY = "Python implementation of the 'Circuit Breaker' Pattern"
DESCRIPTION = "Python implementation of the 'Circuit Breaker' Pattern"
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python39-circuitbreaker-1.3.2-1.8.noarch.rpm"
RPM_HASH = "5cf6730d415fc4b542e3295b0d8447d92a50294770db42563fbc861777059fabe18fae14d76c4e510129b5ec980dd76c38382994e8c95f3a2da83a8e2c670486"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-circuitbreaker \
python39-circuitbreaker \
python3dist-circuitbreaker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
