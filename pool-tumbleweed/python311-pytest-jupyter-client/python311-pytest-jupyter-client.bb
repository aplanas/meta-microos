SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions [client] extra"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions. \
This subpackage provides the [client] extra dependencies"
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python311-pytest-jupyter-client-0.7.0-1.4.noarch.rpm"
RPM_HASH = "a5e843eb6a128ba8d91794a88e140a53942db387ff02dd3d6d010ba283c23b2c63d1a3c60ee3cb90d625d0957e47a608d978c7c245c585b29ca69e0149f9a0b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-jupyter-client \
python311-pytest-jupyter-client"

RDEPENDS:${PN} += "python311-ipykernel \
python311-jupyter-client \
python311-pytest-jupyter"

inherit rpm
