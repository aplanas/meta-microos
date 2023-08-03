SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions [server] extra"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions. \
This subpackage provides the [server] extra dependencies"
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python39-pytest-jupyter-server-0.7.0-1.4.noarch.rpm"
RPM_HASH = "2add99f0a608aa6df3b10cd6031ef17f11403e039c691a4b7ef6cbed18181f3c346dc1ffa9a8a2820db064763a08b6fd5769e6f285cff474d524fd1ef599bc42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pytest-jupyter-server"

RDEPENDS:${PN} += "python39-jupyter-server \
python39-nbformat \
python39-pytest-jupyter \
python39-pytest-jupyter-client"

inherit rpm
