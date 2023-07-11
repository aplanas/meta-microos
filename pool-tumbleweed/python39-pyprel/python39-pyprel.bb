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

RPM_NAME = "python39-pyprel-2018.9.14.1501-4.11.noarch.rpm"
RPM_HASH = "7b57f463daf62cce2e67ee79c1beed5f3bbdaee2c4e0929404c7dff17f3191e176343efa934235c56bb5c9d5ec301a3f645a68a25bb6bcd4197c656523463e2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyprel \
python39-pyprel \
python3dist-pyprel"

RDEPENDS:${PN} += "python-abi \
python39-Pillow \
python39-numpy \
python39-pandas \
python39-pyfiglet \
python39-shijian"

inherit rpm
