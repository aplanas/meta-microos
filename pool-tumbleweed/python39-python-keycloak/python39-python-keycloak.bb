SUMMARY = "Python package providing access to the Keycloak API"
DESCRIPTION = "Python package providing access to the Keycloak API"
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python39-python-keycloak-2.6.0-1.6.noarch.rpm"
RPM_HASH = "5ab58c82a8dc7999432daf0681136fd157d896f5112a8efaa9a46da0d43d14e29bdab093264dd8c35dc9101cc176660e742ecaa0778ae02942dc8c2ce73a2e8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-keycloak \
python39-python-keycloak \
python3dist-python-keycloak"

RDEPENDS:${PN} += "python-abi \
python39-python-jose \
python39-requests \
python39-setuptools"

inherit rpm
