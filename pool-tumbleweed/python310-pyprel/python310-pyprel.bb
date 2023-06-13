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

RPM_NAME = "python310-pyprel-2018.9.14.1501-4.9.noarch.rpm"
RPM_HASH = "c29ae08b4aecfdc2f375004734ae54503b15147b9286e05cacbf3b1f303a19eb1743572cd364c1431dadbee5ab3b9e121de37c4274e26b941ea826e15fb2f49e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyprel \
python3.10dist(pyprel) \
python310-pyprel \
python3dist(pyprel)"

RDEPENDS:${PN} += "python(abi) \
python310-Pillow \
python310-numpy \
python310-pandas \
python310-pyfiglet \
python310-shijian"

inherit rpm
