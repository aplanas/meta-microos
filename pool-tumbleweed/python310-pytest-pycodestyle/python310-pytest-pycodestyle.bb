SUMMARY = "Pytest plugin to run pycodestyle"
DESCRIPTION = "pytest plugin to run pycodestyle in python tests"
LICENSE = "MIT"

PV = "2.3.1"

RPM_NAME = "python310-pytest-pycodestyle-2.3.1-1.3.noarch.rpm"
RPM_HASH = "5a796bb49e6cc93334e58d6e3cc429d9f1172bd32cc3de0a7bcae5bd890b3cd5c76244eb725085a09e52589997ecfdb504bd058d7b876be1f339103af3ff4194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-codestyle \
python3-pytest-pycodestyle \
python3.10dist(pytest-pycodestyle) \
python310-pytest-codestyle \
python310-pytest-pycodestyle \
python3dist(pytest-pycodestyle)"

RDEPENDS:${PN} += "python(abi) \
python310-py \
python310-pycodestyle \
python310-pytest \
python310-setuptools"

inherit rpm
