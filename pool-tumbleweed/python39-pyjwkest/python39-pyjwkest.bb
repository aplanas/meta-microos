SUMMARY = "Python implementation of JWT, JWE, JWS and JWK"
DESCRIPTION = "Python implementation of JWT, JWE, JWS and JWK. \
(JSON web signarure) \
 \
Note: This library is NOT actively maintained anymore."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "python39-pyjwkest-1.4.2-2.11.noarch.rpm"
RPM_HASH = "9278717b3af6d4229b12da27c1f62f0b465bd17327af82ba5c17fe4e2a08fbedefc43c2d823cbf3487760ce80b41a08e8bfd10dd4f8f56a54ad8f10c7210fd24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyjwkest \
python39-pyjwkest \
python3dist-pyjwkest"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-future \
python39-pycryptodomex \
python39-requests \
python39-six \
update-alternatives"

inherit rpm
