SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions [client] extra"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions. \
This subpackage provides the [client] extra dependencies"
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python310-pytest-jupyter-client-0.7.0-1.3.noarch.rpm"
RPM_HASH = "d5ecc65041cbfe6981f4c25fafdfed2863c44bb5afb64b25f42b8a217d2380d0c7cc141762d6d7ab343822f7277bc4d034442d192852886cedb9c86e577568f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pytest-jupyter-client"

RDEPENDS:${PN} += "python310-ipykernel \
python310-jupyter-client \
python310-pytest-jupyter"

inherit rpm
