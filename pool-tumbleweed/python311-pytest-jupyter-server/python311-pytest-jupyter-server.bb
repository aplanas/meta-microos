SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions [server] extra"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions. \
This subpackage provides the [server] extra dependencies"
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python311-pytest-jupyter-server-0.7.0-1.4.noarch.rpm"
RPM_HASH = "1ba9e213a056d34612b115469e01d3e227f19a925be2e1d5572b514a4359d5a1ab0018e14ad27a78fe97a3e6fa2854602e3af64898042535637c9fe85f092f78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-jupyter-server \
python311-pytest-jupyter-server"

RDEPENDS:${PN} += "python311-jupyter-server \
python311-nbformat \
python311-pytest-jupyter \
python311-pytest-jupyter-client"

inherit rpm
