SUMMARY = "Python implementation of JWT, JWE, JWS and JWK"
DESCRIPTION = "Python implementation of JWT, JWE, JWS and JWK. \
(JSON web signarure) \
 \
Note: This library is NOT actively maintained anymore."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "python310-pyjwkest-1.4.2-2.9.noarch.rpm"
RPM_HASH = "5ccbb353736d04cd44a343cb60ddb2088d7006e7934b27f0c515011b6c39e0a5558d97d19b55a97480d88d9ca8ce6e1d788d3dc4108d2936697f8538329acb63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyjwkest \
python3.10dist(pyjwkest) \
python310-pyjwkest \
python3dist(pyjwkest)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-future \
python310-pycryptodomex \
python310-requests \
python310-six \
update-alternatives"

inherit rpm
