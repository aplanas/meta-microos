SUMMARY = "API to interact with the python pyproject.toml based projects"
DESCRIPTION = "pyproject-api aims to abstract away interaction with \
pyproject.toml style projects in a flexible way."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python310-pyproject-api-1.5.1-1.3.noarch.rpm"
RPM_HASH = "bfdd8cc802cd19dab9b9daeae4efe472b95b26dcd1c8d1e2da221f2d8c49844f93c7eaf820daf336b3ae79040ede2718df01d6cad1c8330af87fe9a099f14842"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyproject-api \
python310-pyproject-api \
python3dist-pyproject-api"

RDEPENDS:${PN} += "python-abi \
python310-packaging"

inherit rpm
