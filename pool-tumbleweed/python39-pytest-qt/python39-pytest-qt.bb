SUMMARY = "Pytest support for PyQt and PySide applications"
DESCRIPTION = "Pytest-qt is a pytest plugin that allows programmers to write tests \
for PySide and PyQt applications. \
 \
The main usage is to use the `qtbot` fixture, responsible for handling `qApp` \
creation as needed and provides methods to simulate user interaction, \
like key presses and mouse clicks."
LICENSE = "MIT"

PV = "4.2.0"

RPM_NAME = "python39-pytest-qt-4.2.0-2.1.noarch.rpm"
RPM_HASH = "bfe4643b6c9d643da28e1e608853552138688030fb9eadd334c33d61715cce6a52ddeecc15f8f5c518040411884fa88b752685b66e6ff62df1a4d224d31f3f06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-qt) \
python39-pytest-qt \
python3dist(pytest-qt)"

RDEPENDS:${PN} += "(python39-qt5 or python39-PyQt6) \
bitstream-vera-fonts \
python(abi) \
python39-pytest"

inherit rpm
