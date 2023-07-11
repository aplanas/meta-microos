SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions [server] extra"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions. \
This subpackage provides the [server] extra dependencies"
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python311-pytest-jupyter-server-0.7.0-1.3.noarch.rpm"
RPM_HASH = "e06788ddd7898b5ff9b03d407c77ea16cbe14fd3694ee0f9ec6b85d870239f65b1914bb5bd3d18fa308c472f927c1b0a9cf3778850bfec36b32ba275d4d25dbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-jupyter-server \
python311-pytest-jupyter-server"

RDEPENDS:${PN} += "python311-jupyter-server \
python311-nbformat \
python311-pytest-jupyter \
python311-pytest-jupyter-client"

inherit rpm
