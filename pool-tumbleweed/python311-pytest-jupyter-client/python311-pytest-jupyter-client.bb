SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions [client] extra"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions. \
This subpackage provides the [client] extra dependencies"
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python311-pytest-jupyter-client-0.7.0-1.1.noarch.rpm"
RPM_HASH = "093639f6c6fc3d9dfa445e5c3d3a7f63d94077d2a002682b1cf7f844ec7c74ef9127377db45be1a263b84b6cf97d775bce28a8dc3f77e0542da8b69bfcec9be5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-pytest-jupyter-client"

RDEPENDS:${PN} += "python311-ipykernel \
python311-jupyter-client \
python311-pytest-jupyter"

inherit rpm
