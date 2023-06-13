SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions [client] extra"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions. \
This subpackage provides the [client] extra dependencies"
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python310-pytest-jupyter-client-0.7.0-1.1.noarch.rpm"
RPM_HASH = "24373058435e7bdef66f4b292c833bc4b5b07a489c045ae9f917a5e50fe85519bcc3dab241f3ebc39880d733dc8e4dc5b7e35210f0d404d7207795bb2e3f9a14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-jupyter-client \
python310-pytest-jupyter-client"

RDEPENDS:${PN} += "python310-ipykernel \
python310-jupyter_client \
python310-pytest-jupyter"

inherit rpm
