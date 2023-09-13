SUMMARY = "Python implementation of JWT, JWE, JWS and JWK"
DESCRIPTION = "Python implementation of JWT, JWE, JWS and JWK. \
(JSON web signarure) \
 \
Note: This library is NOT actively maintained anymore."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "python311-pyjwkest-1.4.2-3.1.noarch.rpm"
RPM_HASH = "8a306bb8353073897429ac8caaa76f5746f54b808fc6305ed653e83556b10b14968b226585d7205f2506c64a4e15adf8ccc46b6a4969f516278317491e3940e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyjwkest \
python3.11dist-pyjwkest \
python311-pyjwkest \
python3dist-pyjwkest"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-pycryptodomex \
python311-requests \
python311-six \
update-alternatives"

inherit rpm
