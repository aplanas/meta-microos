SUMMARY = "Python package providing access to the Keycloak API"
DESCRIPTION = "Python package providing access to the Keycloak API"
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python311-python-keycloak-2.6.0-1.6.noarch.rpm"
RPM_HASH = "19519ed20c99b4c6b7350ac753afb0175d98a08389c65284fb27494bde565319c8249042be21bca0081d392858a95c5bb707bc55104ef600b1227cbf709d5388"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-keycloak \
python3.11dist-python-keycloak \
python311-python-keycloak \
python3dist-python-keycloak"

RDEPENDS:${PN} += "python-abi \
python311-python-jose \
python311-requests \
python311-setuptools"

inherit rpm
