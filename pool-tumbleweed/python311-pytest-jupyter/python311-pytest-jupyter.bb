SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python311-pytest-jupyter-0.7.0-1.3.noarch.rpm"
RPM_HASH = "874efd090aa6f75aa072268ca989f074cf2cb5bd113ebd04b217487e583e653c1be265a378ffbff67759901af7a92919892947d5724cc075f47cce80565226a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-jupyter \
python3.11dist-pytest-jupyter \
python311-pytest-jupyter \
python3dist-pytest-jupyter"

RDEPENDS:${PN} += "python-abi \
python311-jupyter-core \
python311-pytest"

inherit rpm
