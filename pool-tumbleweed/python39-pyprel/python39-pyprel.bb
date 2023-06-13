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

RPM_NAME = "python39-pyprel-2018.9.14.1501-4.9.noarch.rpm"
RPM_HASH = "8a59637d10972ea063f90638499d268695cc3942eef410b1e3c70686addd1cffc74efacf66e8e88ec3e5389b5c4a4941f3f31a729c9332671b17fbadc77b179b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pyprel) \
python39-pyprel \
python3dist(pyprel)"

RDEPENDS:${PN} += "python(abi) \
python39-Pillow \
python39-numpy \
python39-pandas \
python39-pyfiglet \
python39-shijian"

inherit rpm
