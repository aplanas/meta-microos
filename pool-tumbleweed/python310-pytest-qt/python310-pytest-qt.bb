SUMMARY = "Pytest support for PyQt and PySide applications"
DESCRIPTION = "Pytest-qt is a pytest plugin that allows programmers to write tests \
for PySide and PyQt applications. \
 \
The main usage is to use the `qtbot` fixture, responsible for handling `qApp` \
creation as needed and provides methods to simulate user interaction, \
like key presses and mouse clicks."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python310-pytest-qt-4.2.0-4.3.noarch.rpm"
RPM_HASH = "d935c8783860745f11263f03725c69730a2da757a4fd15ce84bcfec000923d6524977e2f3d7174b35eecff152dae73a8858886ae870b1533b48078832a6668db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-qt \
python310-pytest-qt \
python3dist-pytest-qt"

RDEPENDS:${PN} += "bitstream-vera-fonts \
python-abi \
python310-pytest"

inherit rpm
