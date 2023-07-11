SUMMARY = "Python print elegant"
DESCRIPTION = "This module provides Python rendering functionality. It can render a \
dictionary such that it is displayed with indentations for \
illustration of hierarchy. It can center blocks of text for terminal \
output. It can render segment displays. It can render and display \
tables of various specified widths and column widths with various \
text wrapping features and delimiters. It can provide color palettes, \
extend them and save images of them."
LICENSE = "GPL-3.0-only"

PV = "2018.9.14.1501"

RPM_NAME = "python310-pyprel-2018.9.14.1501-4.11.noarch.rpm"
RPM_HASH = "ea44b2ed1c6c1dea6533cd15465dbad458afed38e0a1cf6186aac72eb2097c85b03f5c80c65570a4d0ada519939d31d08406f098e9e7845899c5d81f7c00efd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyprel \
python310-pyprel \
python3dist-pyprel"

RDEPENDS:${PN} += "python-abi \
python310-Pillow \
python310-numpy \
python310-pandas \
python310-pyfiglet \
python310-shijian"

inherit rpm
