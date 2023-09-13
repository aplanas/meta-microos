SUMMARY = "Pytest support for PyQt and PySide applications"
DESCRIPTION = "Pytest-qt is a pytest plugin that allows programmers to write tests \
for PySide and PyQt applications. \
 \
The main usage is to use the `qtbot` fixture, responsible for handling `qApp` \
creation as needed and provides methods to simulate user interaction, \
like key presses and mouse clicks."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python311-pytest-qt-4.2.0-4.3.noarch.rpm"
RPM_HASH = "4506a038cf1eb6a356077dfb7d3fbbe2d6627d5dddf1368e3eb153ac968124399f21114907a464f14048e7b03306aee9f0011feb9cec3d1977568a17333c6f71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-qt \
python3.11dist-pytest-qt \
python311-pytest-qt \
python3dist-pytest-qt"

RDEPENDS:${PN} += "bitstream-vera-fonts \
python-abi \
python311-pytest"

inherit rpm
