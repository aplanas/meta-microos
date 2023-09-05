SUMMARY = "API to interact with the python pyproject.toml based projects"
DESCRIPTION = "pyproject-api aims to abstract away interaction with \
pyproject.toml style projects in a flexible way."
LICENSE = "MIT"

PV = "1.5.4"

RPM_NAME = "python310-pyproject-api-1.5.4-1.1.noarch.rpm"
RPM_HASH = "1cdb8878cdf46ae42b4f7c0b1f61b5caf55a7926701c0581314a25ddf8f3af61d018789fdd11063c479b9cccf5e1628636fcff17ca6765497c89900b68b4babf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyproject-api \
python310-pyproject-api \
python3dist-pyproject-api"

RDEPENDS:${PN} += "python-abi \
python310-packaging"

inherit rpm
