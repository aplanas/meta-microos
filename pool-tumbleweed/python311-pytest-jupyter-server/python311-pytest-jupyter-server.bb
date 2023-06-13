SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions [server] extra"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions. \
This subpackage provides the [server] extra dependencies"
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python311-pytest-jupyter-server-0.7.0-1.1.noarch.rpm"
RPM_HASH = "4342fd6ecd66db054a47e7dd69ae22fbcf3d5805d3d54ada8d3ef82fe67dc8df4e50df34e50207561596c6b4c5e257d180d311f3cc07d850dc674a902b908239"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-pytest-jupyter-server"

RDEPENDS:${PN} += "python311-jupyter-server \
python311-nbformat \
python311-pytest-jupyter \
python311-pytest-jupyter-client"

inherit rpm
