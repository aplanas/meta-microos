SUMMARY = "Pytest plugin to check source code with pyflakes"
DESCRIPTION = "py.test plugin for efficiently checking python source with pyflakes."
LICENSE = "MIT"

PV = "4.0.5"

RPM_NAME = "python311-pytest-flakes-4.0.5-1.6.noarch.rpm"
RPM_HASH = "4eca3a6d19821f3f6cd539ca1d46233780379fe8f638eee133ee85e4abf1efc472ff5b122f04c4a61ee08dcfab9da9066ab72d2c522103f0fc6dc89a290d78b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-flakes) \
python311-pytest-flakes \
python3dist(pytest-flakes)"
RDEPENDS:${PN} += "python(abi) \
python311-pyflakes \
python311-pytest"

inherit rpm
