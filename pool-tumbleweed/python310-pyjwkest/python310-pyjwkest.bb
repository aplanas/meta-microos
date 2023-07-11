SUMMARY = "Python implementation of JWT, JWE, JWS and JWK"
DESCRIPTION = "Python implementation of JWT, JWE, JWS and JWK. \
(JSON web signarure) \
 \
Note: This library is NOT actively maintained anymore."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "python310-pyjwkest-1.4.2-2.11.noarch.rpm"
RPM_HASH = "dfe11313e49c09ca278243a1f1940eea4da12a14e0618dda6cac5cb20490b802c65650ad366b204ee7f29b549d915aeb164d63ee834afe3809c7a30807d79f6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyjwkest \
python310-pyjwkest \
python3dist-pyjwkest"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-future \
python310-pycryptodomex \
python310-requests \
python310-six \
update-alternatives"

inherit rpm
