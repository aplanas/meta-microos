SUMMARY = "Python implementation of JWT, JWE, JWS and JWK"
DESCRIPTION = "Python implementation of JWT, JWE, JWS and JWK. \
(JSON web signarure) \
 \
Note: This library is NOT actively maintained anymore."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "python39-pyjwkest-1.4.2-3.1.noarch.rpm"
RPM_HASH = "bd7368714f71b41321af1eada7faedf6b74843d6f635f52e3871288a6cfa41cc1b863e6e6692a36ae7fc46320ecf55bec300110d9c5780ff2b21be00a4aef98e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyjwkest \
python39-pyjwkest \
python3dist-pyjwkest"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-pycryptodomex \
python39-requests \
python39-six \
update-alternatives"

inherit rpm
