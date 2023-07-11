SUMMARY = "Pytest support for PyQt and PySide applications"
DESCRIPTION = "Pytest-qt is a pytest plugin that allows programmers to write tests \
for PySide and PyQt applications. \
 \
The main usage is to use the `qtbot` fixture, responsible for handling `qApp` \
creation as needed and provides methods to simulate user interaction, \
like key presses and mouse clicks."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python310-pytest-qt-4.2.0-4.1.noarch.rpm"
RPM_HASH = "90b005b652cc1cc830aa2004338aff217628f58e6da66cd8b448daf55e59e85ea38c224453c2c6f85c0ac1e7ca73f68431f3773b9fabaec98b6071470c17341e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-qt \
python310-pytest-qt \
python3dist-pytest-qt"

RDEPENDS:${PN} += "bitstream-vera-fonts \
python-abi \
python310-pytest"

inherit rpm
