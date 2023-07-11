SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python39-pytest-jupyter-0.7.0-1.3.noarch.rpm"
RPM_HASH = "b499e8feac48f2621fb909c44dbd035521b57d3e545a95107860c811cc93d23a923022744c1360a43cfe998a88165299bd077d623460bd7f593c52066f91f2ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-jupyter \
python39-pytest-jupyter \
python3dist-pytest-jupyter"

RDEPENDS:${PN} += "python-abi \
python39-jupyter-core \
python39-pytest"

inherit rpm
