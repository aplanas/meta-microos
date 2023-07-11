SUMMARY = "API to interact with the python pyproject.toml based projects"
DESCRIPTION = "pyproject-api aims to abstract away interaction with \
pyproject.toml style projects in a flexible way."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python311-pyproject-api-1.5.1-1.3.noarch.rpm"
RPM_HASH = "695af3eb6d8c0bb832e3e47caac2df10b7a231b698c62f44249248831540ce6b26f2f0bc4371d64ed285db190d7cb259f4488cc2e44ce12b05ddba1cb477e784"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyproject-api \
python3.11dist-pyproject-api \
python311-pyproject-api \
python3dist-pyproject-api"

RDEPENDS:${PN} += "python-abi \
python311-packaging"

inherit rpm
