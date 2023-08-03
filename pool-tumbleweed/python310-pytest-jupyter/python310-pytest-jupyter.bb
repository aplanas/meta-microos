SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.7.0"

RPM_NAME = "python310-pytest-jupyter-0.7.0-1.4.noarch.rpm"
RPM_HASH = "9524b407dac1cf11bd9bd0660b23ed7a62ac1a1ae3900feae6f5d03f10d21b589b43074a5d6cd983f0033aabe40e889dd02fbd515769dfb5384bd74f0596bf73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-jupyter \
python310-pytest-jupyter \
python3dist-pytest-jupyter"

RDEPENDS:${PN} += "python-abi \
python310-jupyter-core \
python310-pytest"

inherit rpm
