SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions [client] extra"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions. \
This subpackage provides the [client] extra dependencies"
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python39-pytest-jupyter-client-0.7.0-1.1.noarch.rpm"
RPM_HASH = "fc867825a6ed283ae2a8ca54b642f38bdd06bac8be9f053aee118ba549f5f17d79b777d55ba73320576fb8993c23061f0282c76ba198552fde2f51016f71aa32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pytest-jupyter-client"
RDEPENDS:${PN} += "python39-ipykernel \
python39-jupyter_client \
python39-pytest-jupyter"

inherit rpm
