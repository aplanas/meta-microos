SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions [client] extra"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions. \
This subpackage provides the [client] extra dependencies"
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python39-pytest-jupyter-client-0.7.0-1.3.noarch.rpm"
RPM_HASH = "7010c97aee70cca88080523fc896c704fb8d375b4fc5a9ab20efd314a5ea658faa1cac7dc6572ba909b79c4193f731dbb945ea349e1a456b5891bef225507ff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pytest-jupyter-client"

RDEPENDS:${PN} += "python39-ipykernel \
python39-jupyter-client \
python39-pytest-jupyter"

inherit rpm
