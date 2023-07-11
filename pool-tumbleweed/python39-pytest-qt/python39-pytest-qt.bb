SUMMARY = "Pytest support for PyQt and PySide applications"
DESCRIPTION = "Pytest-qt is a pytest plugin that allows programmers to write tests \
for PySide and PyQt applications. \
 \
The main usage is to use the `qtbot` fixture, responsible for handling `qApp` \
creation as needed and provides methods to simulate user interaction, \
like key presses and mouse clicks."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python39-pytest-qt-4.2.0-4.1.noarch.rpm"
RPM_HASH = "c05c65af66619628c080a404a2e55c428b4f546f5a45bb7f6731fec3d65fbe5851a2a5fade6707894441e88a8c45e30a7c2e6a89e17d2eec892efa00c57c5032"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-qt \
python39-pytest-qt \
python3dist-pytest-qt"

RDEPENDS:${PN} += "bitstream-vera-fonts \
python-abi \
python39-pytest"

inherit rpm
