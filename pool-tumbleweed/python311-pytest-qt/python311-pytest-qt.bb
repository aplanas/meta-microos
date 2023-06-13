SUMMARY = "Pytest support for PyQt and PySide applications"
DESCRIPTION = "Pytest-qt is a pytest plugin that allows programmers to write tests \
for PySide and PyQt applications. \
 \
The main usage is to use the `qtbot` fixture, responsible for handling `qApp` \
creation as needed and provides methods to simulate user interaction, \
like key presses and mouse clicks."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python311-pytest-qt-4.2.0-2.1.noarch.rpm"
RPM_HASH = "944f18747cf451ad5938f37f71d1f5c3cb8937961dd8fcd1f61ecc73ca6e4cd4b8a75e32a7bb8a09e513e25f0033d6061388fd6723d750265cb9b9554ded0dc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-qt) \
python311-pytest-qt \
python3dist(pytest-qt)"

RDEPENDS:${PN} += "(python311-qt5 or python311-PyQt6) \
bitstream-vera-fonts \
python(abi) \
python311-pytest"

inherit rpm
