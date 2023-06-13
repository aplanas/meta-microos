SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python39-pytest-jupyter-0.7.0-1.1.noarch.rpm"
RPM_HASH = "eb7791526254ee271e64542eb3e83a284dc3c2ae75fb16650b8e2605c2747b4ea877c288ad140b83a548a02debb8c681c9cbbf18bef712ab00be7bd3d9ecd0d7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-jupyter) \
python39-pytest-jupyter \
python3dist(pytest-jupyter)"

RDEPENDS:${PN} += "python(abi) \
python39-jupyter_core \
python39-pytest"

inherit rpm
