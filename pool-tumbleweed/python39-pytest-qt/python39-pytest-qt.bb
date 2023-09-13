SUMMARY = "Pytest support for PyQt and PySide applications"
DESCRIPTION = "Pytest-qt is a pytest plugin that allows programmers to write tests \
for PySide and PyQt applications. \
 \
The main usage is to use the `qtbot` fixture, responsible for handling `qApp` \
creation as needed and provides methods to simulate user interaction, \
like key presses and mouse clicks."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python39-pytest-qt-4.2.0-4.3.noarch.rpm"
RPM_HASH = "23f8b2d074518606fb9c2002fa3dfd65e033927eff6b866407c20233016f6141226f162d878746a7782208039a73f5203606c1420db7e90338bf0231164f1055"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-qt \
python39-pytest-qt \
python3dist-pytest-qt"

RDEPENDS:${PN} += "bitstream-vera-fonts \
python-abi \
python39-pytest"

inherit rpm
