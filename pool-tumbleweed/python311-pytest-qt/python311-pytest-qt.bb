SUMMARY = "Pytest support for PyQt and PySide applications"
DESCRIPTION = "Pytest-qt is a pytest plugin that allows programmers to write tests \
for PySide and PyQt applications. \
 \
The main usage is to use the `qtbot` fixture, responsible for handling `qApp` \
creation as needed and provides methods to simulate user interaction, \
like key presses and mouse clicks."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python311-pytest-qt-4.2.0-4.1.noarch.rpm"
RPM_HASH = "c1062fb53e7be6dad73c33e8a09eb9dc3fd190544d492080cd11b419b2787fd45f27178445283ede7f9434c51921b093e089c381e1749e7fb8f0628cc508da2c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-qt \
python3.11dist-pytest-qt \
python311-pytest-qt \
python3dist-pytest-qt"

RDEPENDS:${PN} += "bitstream-vera-fonts \
python-abi \
python311-pytest"

inherit rpm
