SUMMARY = "Pytest support for PyQt and PySide applications"
DESCRIPTION = "Pytest-qt is a pytest plugin that allows programmers to write tests \
for PySide and PyQt applications. \
 \
The main usage is to use the `qtbot` fixture, responsible for handling `qApp` \
creation as needed and provides methods to simulate user interaction, \
like key presses and mouse clicks."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python310-pytest-qt-4.2.0-4.2.noarch.rpm"
RPM_HASH = "dd7fbea9b6c2ae74751498fad2eb80b74fc30925b1efecea92cdb28de30b92033757d284a5681af366852c68aae28cb176fbe0fbe8a4b80cda7b5ab05cc8c1f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-qt \
python310-pytest-qt \
python3dist-pytest-qt"

RDEPENDS:${PN} += "bitstream-vera-fonts \
python-abi \
python310-pytest"

inherit rpm
