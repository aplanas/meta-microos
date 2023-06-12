SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions [server] extra"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions. \
This subpackage provides the [server] extra dependencies"
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python39-pytest-jupyter-server-0.7.0-1.1.noarch.rpm"
RPM_HASH = "9462c2413551938f66e004611bb74115fb323032988c03ab7464763af58efc452ba2c19de5486d6af9700ff5dfc48d0527df29da96fa909dae1dc0c9adc2b2e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pytest-jupyter-server"
RDEPENDS:${PN} += "python39-jupyter-server \
python39-nbformat \
python39-pytest-jupyter \
python39-pytest-jupyter-client"

inherit rpm
