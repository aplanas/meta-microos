SUMMARY = "Pytest support for PyQt and PySide applications"
DESCRIPTION = "Pytest-qt is a pytest plugin that allows programmers to write tests \
for PySide and PyQt applications. \
 \
The main usage is to use the `qtbot` fixture, responsible for handling `qApp` \
creation as needed and provides methods to simulate user interaction, \
like key presses and mouse clicks."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python39-pytest-qt-4.2.0-4.2.noarch.rpm"
RPM_HASH = "40b72a736df48c70663d3e2a2ecfc6d2430f021f11e291581bf9a02304055e96c13f47fc45c1442d536ae4269810bf6c666dc94730b11c1ca7290131192c830d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-qt \
python39-pytest-qt \
python3dist-pytest-qt"

RDEPENDS:${PN} += "bitstream-vera-fonts \
python-abi \
python39-pytest"

inherit rpm
