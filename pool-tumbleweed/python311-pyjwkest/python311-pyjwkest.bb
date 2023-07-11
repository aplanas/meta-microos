SUMMARY = "Python implementation of JWT, JWE, JWS and JWK"
DESCRIPTION = "Python implementation of JWT, JWE, JWS and JWK. \
(JSON web signarure) \
 \
Note: This library is NOT actively maintained anymore."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "python311-pyjwkest-1.4.2-2.11.noarch.rpm"
RPM_HASH = "24f7cf4ba9c0d5e2f299a75c8a8876145c6dfe1c1a8f3766f918ffcdd6a1b042618dd3bc3f99ed465925ffd5c6f59aac055116cbd57114a0951605fd7bc378dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyjwkest \
python3.11dist-pyjwkest \
python311-pyjwkest \
python3dist-pyjwkest"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-future \
python311-pycryptodomex \
python311-requests \
python311-six \
update-alternatives"

inherit rpm
