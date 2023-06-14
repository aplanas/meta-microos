SUMMARY = "Python package providing access to the Keycloak API"
DESCRIPTION = "Python package providing access to the Keycloak API"
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python310-python-keycloak-2.6.0-1.4.noarch.rpm"
RPM_HASH = "cf32bd34e490d08b73cae92f9af58d4a2eeb98638e4a512030197f6a46dedb9f2b522c068455a1bd40fb98bd9907b4485215074f5d8603e1f097be6f24d23214"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-keycloak \
python3.10dist-python-keycloak \
python310-python-keycloak \
python3dist-python-keycloak"

RDEPENDS:${PN} += "python-abi \
python310-python-jose \
python310-requests \
python310-setuptools"

inherit rpm
