SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions [server] extra"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions. \
This subpackage provides the [server] extra dependencies"
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python310-pytest-jupyter-server-0.7.0-1.4.noarch.rpm"
RPM_HASH = "cc8bf2025f99d948c8d8cd1dedf8c4b116583abbeff50c7ac01ba232b30e140abaf900836996857e4456f8cba89b443da3a50b401112c7161425ec4e12ab163f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-pytest-jupyter-server"

RDEPENDS:${PN} += "python310-jupyter-server \
python310-nbformat \
python310-pytest-jupyter \
python310-pytest-jupyter-client"

inherit rpm
