SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python39-pytest-jupyter-0.7.0-1.4.noarch.rpm"
RPM_HASH = "e944c6388ba68bae3fc8f186be73de3682ee983a67acc99d4acb4b0f25b59807ed4b88df2ce217ef21e63755e0297a325158977618f79e6517b5a2386d2fac8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-jupyter \
python39-pytest-jupyter \
python3dist-pytest-jupyter"

RDEPENDS:${PN} += "python-abi \
python39-jupyter-core \
python39-pytest"

inherit rpm
