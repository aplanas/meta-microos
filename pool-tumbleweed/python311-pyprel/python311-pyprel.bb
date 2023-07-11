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

RPM_NAME = "python311-pyprel-2018.9.14.1501-4.11.noarch.rpm"
RPM_HASH = "e6bb3ce00b7d286e8c46e0339828f0835af4f602960e9d1e81a46a4ca690749f5e2ce8d728927d273a5cee555b1e99e6d16f744e0238ecae723e7fc5034f910c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyprel \
python3.11dist-pyprel \
python311-pyprel \
python3dist-pyprel"

RDEPENDS:${PN} += "python-abi \
python311-Pillow \
python311-numpy \
python311-pandas \
python311-pyfiglet \
python311-shijian"

inherit rpm
