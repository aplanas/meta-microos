SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions [server] extra"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions. \
This subpackage provides the [server] extra dependencies"
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python39-pytest-jupyter-server-0.7.0-1.3.noarch.rpm"
RPM_HASH = "a020cdf587fd97ca8ed10e6877c573d294968bc3e7fc5b2614c90ef7a03bdfc6a19064149b3d30990353c87a0badcc4a1da39df8375be2da146f3d842f98717f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pytest-jupyter-server"

RDEPENDS:${PN} += "python39-jupyter-server \
python39-nbformat \
python39-pytest-jupyter \
python39-pytest-jupyter-client"

inherit rpm
