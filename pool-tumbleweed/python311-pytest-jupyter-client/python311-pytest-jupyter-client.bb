SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions [client] extra"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions. \
This subpackage provides the [client] extra dependencies"
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python311-pytest-jupyter-client-0.7.0-1.3.noarch.rpm"
RPM_HASH = "cee879f9998006bb9ad17f3cc291d197d6307fbc72a0f0c9424fa5426159c4f6ee84db934f8d9ff11dba7e391fa2765ebb4761aed21de03a78282f62b1ac3df6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-jupyter-client \
python311-pytest-jupyter-client"

RDEPENDS:${PN} += "python311-ipykernel \
python311-jupyter-client \
python311-pytest-jupyter"

inherit rpm
