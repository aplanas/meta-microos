SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python310-pytest-jupyter-0.7.0-1.3.noarch.rpm"
RPM_HASH = "2490c58454f46d5d8d1c53408fca4446567537c03ffcbf3acc33e6f2987bd91fe7f6c4d44787d5e4ca050625e96c69496ffc675408a0e1f755fd74f5623c85c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-jupyter \
python310-pytest-jupyter \
python3dist-pytest-jupyter"

RDEPENDS:${PN} += "python-abi \
python310-jupyter-core \
python310-pytest"

inherit rpm
