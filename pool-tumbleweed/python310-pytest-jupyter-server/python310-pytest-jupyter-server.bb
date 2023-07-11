SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions [server] extra"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions. \
This subpackage provides the [server] extra dependencies"
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python310-pytest-jupyter-server-0.7.0-1.3.noarch.rpm"
RPM_HASH = "c07484c5178479664ff0145f1d6a10097780787be60bd0b92771d654a7998dfeecef0b418d288b07f326962166db794e3cc6cf37432783d43eb68a70244a401a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pytest-jupyter-server"

RDEPENDS:${PN} += "python310-jupyter-server \
python310-nbformat \
python310-pytest-jupyter \
python310-pytest-jupyter-client"

inherit rpm
