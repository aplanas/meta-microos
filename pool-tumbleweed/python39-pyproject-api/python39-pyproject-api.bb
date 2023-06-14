SUMMARY = "API to interact with the python pyproject.toml based projects"
DESCRIPTION = "pyproject-api aims to abstract away interaction with \
pyproject.toml style projects in a flexible way."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python39-pyproject-api-1.5.1-1.1.noarch.rpm"
RPM_HASH = "e1ea114f43d05be68f14b5d14afe3719b6a8394cec3cfa4e42a1d0315562d37cbae44ba3bb7a0881f3c67b2a23fea29faf4e8de34f8ba8b73edaa3b0150f192d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyproject-api \
python39-pyproject-api \
python3dist-pyproject-api"

RDEPENDS:${PN} += "-python39-importlib-metadata >= 6 if python3-base < 3.8 \
-python39-tomli >= 2.0.1 if python3-base < 3.11 \
python-abi \
python39-packaging"

inherit rpm
