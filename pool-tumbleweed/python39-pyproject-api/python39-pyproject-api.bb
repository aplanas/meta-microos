SUMMARY = "API to interact with the python pyproject.toml based projects"
DESCRIPTION = "pyproject-api aims to abstract away interaction with \
pyproject.toml style projects in a flexible way."
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python39-pyproject-api-1.5.1-1.3.noarch.rpm"
RPM_HASH = "473f7f03fc2ced5e2c2eb5aa71fb02e438747cb4c385cd508f560a308cce3b4b19e18ee67fb4d9319f51095de7477616ba10249b4515146ebd5772c04cd3685f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyproject-api \
python39-pyproject-api \
python3dist-pyproject-api"

RDEPENDS:${PN} += "python-abi \
python39-packaging"

inherit rpm
