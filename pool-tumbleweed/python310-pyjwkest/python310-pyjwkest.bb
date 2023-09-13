SUMMARY = "Python implementation of JWT, JWE, JWS and JWK"
DESCRIPTION = "Python implementation of JWT, JWE, JWS and JWK. \
(JSON web signarure) \
 \
Note: This library is NOT actively maintained anymore."
LICENSE = "Apache-2.0"

PV = "1.4.2"

RPM_NAME = "python310-pyjwkest-1.4.2-3.1.noarch.rpm"
RPM_HASH = "caddd57bf5e7238f09894c3985a8c135408566ff6037c8d3fabfdefd161a4d4625712b54f50c23ec79b5a3fe151024e190ce3834981c44d48ecfed9e2225bd78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyjwkest \
python310-pyjwkest \
python3dist-pyjwkest"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-pycryptodomex \
python310-requests \
python310-six \
update-alternatives"

inherit rpm
