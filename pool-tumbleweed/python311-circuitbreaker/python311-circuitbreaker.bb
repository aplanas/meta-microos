SUMMARY = "Python implementation of the 'Circuit Breaker' Pattern"
DESCRIPTION = "Python implementation of the 'Circuit Breaker' Pattern"
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python311-circuitbreaker-1.3.2-1.10.noarch.rpm"
RPM_HASH = "ea2c6f1242f20b8a071ca8f30b8ccb33b822aca33b404d6a2f6b0b22b127185fa7792bd74c5dc934c57fe80bf503f036c9555e55413daed0a23a6836c0391c03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-circuitbreaker \
python3.11dist-circuitbreaker \
python311-circuitbreaker \
python3dist-circuitbreaker"

RDEPENDS:${PN} += "python-abi"

inherit rpm
