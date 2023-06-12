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

RPM_NAME = "python311-pyprel-2018.9.14.1501-4.9.noarch.rpm"
RPM_HASH = "23fd86cb7575bf757ffab34fe477da93852f31117c2a1e1e05b4ad51be1adf83e96d1c560496318daf1272f860d0ab348c89e9b6a92b7c7bed802b64904683b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyprel) \
python311-pyprel \
python3dist(pyprel)"
RDEPENDS:${PN} += "python(abi) \
python311-Pillow \
python311-numpy \
python311-pandas \
python311-pyfiglet \
python311-shijian"

inherit rpm
