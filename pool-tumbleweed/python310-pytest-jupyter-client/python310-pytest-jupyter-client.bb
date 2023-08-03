SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions [client] extra"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions. \
This subpackage provides the [client] extra dependencies"
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python310-pytest-jupyter-client-0.7.0-1.4.noarch.rpm"
RPM_HASH = "22a4e695fb6b37ca66ff96a085daf492d59a53ad0284b43c9e236a897535714373478e202898e5ac302b4e084c246aef596eee2423031da939204fdd7351e1c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pytest-jupyter-client"

RDEPENDS:${PN} += "python310-ipykernel \
python310-jupyter-client \
python310-pytest-jupyter"

inherit rpm
