SUMMARY = "Pytest support for PyQt and PySide applications"
DESCRIPTION = "Pytest-qt is a pytest plugin that allows programmers to write tests \
for PySide and PyQt applications. \
 \
The main usage is to use the `qtbot` fixture, responsible for handling `qApp` \
creation as needed and provides methods to simulate user interaction, \
like key presses and mouse clicks."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python311-pytest-qt-4.2.0-4.2.noarch.rpm"
RPM_HASH = "1469a1b250a109b3e27c18dd2f57690df0ef9d163c5d15ba8cd17f7b520d0d5d4a147d117c9bacd98a6aff938409bd250ac580c5bbc56ec69621bccdb4a3be6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-qt \
python3.11dist-pytest-qt \
python311-pytest-qt \
python3dist-pytest-qt"

RDEPENDS:${PN} += "bitstream-vera-fonts \
python-abi \
python311-pytest"

inherit rpm
