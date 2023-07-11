SUMMARY = "Python package providing access to the Keycloak API"
DESCRIPTION = "Python package providing access to the Keycloak API"
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python310-python-keycloak-2.6.0-1.6.noarch.rpm"
RPM_HASH = "9bbd5ad2ab86108e3fd859055abfde169ffae78dc34db7eef1980e513f0fb699e137e5eb5f6370078288cf67bc4412664ec55df0a18aaa8427cca79f19785fdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-python-keycloak \
python310-python-keycloak \
python3dist-python-keycloak"

RDEPENDS:${PN} += "python-abi \
python310-python-jose \
python310-requests \
python310-setuptools"

inherit rpm
