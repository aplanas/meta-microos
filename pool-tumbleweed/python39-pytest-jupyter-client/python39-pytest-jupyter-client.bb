SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions [client] extra"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions. \
This subpackage provides the [client] extra dependencies"
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python39-pytest-jupyter-client-0.7.0-1.4.noarch.rpm"
RPM_HASH = "373d9315aa312676c6010fde872e7269dad12c10b84dcd4ec7155fc1c631aae878496bda0a4726088def70aceb36e32d03d75642c17cd2946e8742e6e06f3c2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-pytest-jupyter-client"

RDEPENDS:${PN} += "python39-ipykernel \
python39-jupyter-client \
python39-pytest-jupyter"

inherit rpm
