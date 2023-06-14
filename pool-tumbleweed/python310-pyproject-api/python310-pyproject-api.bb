SUMMARY = "API to interact with the python pyproject.toml based projects"
DESCRIPTION = "pyproject-api aims to abstract away interaction with \
pyproject.toml style projects in a flexible way."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python310-pyproject-api-1.5.1-1.1.noarch.rpm"
RPM_HASH = "eb52165a4523b0b5af58e9338317e9c047107ce85e211d312a23f25ae8ea40e9e179777637a600d3f105c577f6dfdbf2d34d837d257801f1fcd8aba714e1de4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyproject-api \
python3.10dist-pyproject-api \
python310-pyproject-api \
python3dist-pyproject-api"

RDEPENDS:${PN} += "-python310-importlib-metadata >= 6 if python3-base < 3.8 \
-python310-tomli >= 2.0.1 if python3-base < 3.11 \
python-abi \
python310-packaging"

inherit rpm
