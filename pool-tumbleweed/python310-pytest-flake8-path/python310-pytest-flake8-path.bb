SUMMARY = "A pytest fixture for testing flake8 plugins"
DESCRIPTION = "A pytest fixture for testing flake8 plugins."
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python310-pytest-flake8-path-1.5.0-1.1.noarch.rpm"
RPM_HASH = "7d26deda4cac98195df0d968b17bf242cab3e7d457cb7204edb9e607e182da565d44ce0fe62e5ace23de73828eec257df00f9792db2d8a0f119d25fc88bf72cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-flake8-path \
python310-pytest-flake8-path \
python3dist-pytest-flake8-path"

RDEPENDS:${PN} += "python-abi \
python310-flake8 \
python310-pytest"

inherit rpm
