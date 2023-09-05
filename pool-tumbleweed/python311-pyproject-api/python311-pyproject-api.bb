SUMMARY = "API to interact with the python pyproject.toml based projects"
DESCRIPTION = "pyproject-api aims to abstract away interaction with \
pyproject.toml style projects in a flexible way."
LICENSE = "MIT"

PV = "1.5.4"

RPM_NAME = "python311-pyproject-api-1.5.4-1.1.noarch.rpm"
RPM_HASH = "88958dc18a1c7cf430b33f6bad096e5b49d94b4f2217c899bf8df2285102d7b8433ef999d1579bab80ead86e78a911ec66a72d7daa20b49b995e02839e07dc05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyproject-api \
python3.11dist-pyproject-api \
python311-pyproject-api \
python3dist-pyproject-api"

RDEPENDS:${PN} += "python-abi \
python311-packaging"

inherit rpm
