SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python311-pytest-jupyter-0.7.0-1.4.noarch.rpm"
RPM_HASH = "75dc71dcff3c1efd5ae20f258adb5f5978fb25c7360837ae5bd263e755d708fdfa99b656530433fe5569aa5214cb6063a7af54a589fd8e6957d7e442fbade8fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-jupyter \
python3.11dist-pytest-jupyter \
python311-pytest-jupyter \
python3dist-pytest-jupyter"

RDEPENDS:${PN} += "python-abi \
python311-jupyter-core \
python311-pytest"

inherit rpm
