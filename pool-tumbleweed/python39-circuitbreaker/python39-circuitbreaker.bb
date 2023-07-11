SUMMARY = "Python implementation of the 'Circuit Breaker' Pattern"
DESCRIPTION = "Python implementation of the 'Circuit Breaker' Pattern"
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python39-circuitbreaker-1.3.2-1.10.noarch.rpm"
RPM_HASH = "bc2f3ba94be083af52df1888bec80e83987d400260180c8039b889649440e668c54a5e528ee7b7448a754e1b07b4569aa8f18d10c6d05f0c03357d96be1a495f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-circuitbreaker \
python39-circuitbreaker \
python3dist-circuitbreaker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
