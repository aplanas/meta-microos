SUMMARY = "Python package providing access to the Keycloak API"
DESCRIPTION = "Python package providing access to the Keycloak API"
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python311-python-keycloak-2.6.0-1.4.noarch.rpm"
RPM_HASH = "ab79bdeba6f41f5534ff2f754505d8bb533ba30e1285a5b2da92ca0229d85c7cacc7d02ee3d8b7cb30e0d15522801d06ea0fafd7eeb1d056e082b5e00adb2112"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-keycloak \
python311-python-keycloak \
python3dist-python-keycloak"

RDEPENDS:${PN} += "python-abi \
python311-python-jose \
python311-requests \
python311-setuptools"

inherit rpm
