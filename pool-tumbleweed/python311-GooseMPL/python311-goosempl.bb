SUMMARY = "Style and extension functions for matplotlib"
DESCRIPTION = "GooseMPL provides a style and several style extensions for matplotlib, some custom \
functions that extend matplotlib, and several examples to make professional plot \
using matplotlib."
LICENSE = "MIT"

PV = "0.12.1"

RPM_NAME = "python311-GooseMPL-0.12.1-1.5.noarch.rpm"
RPM_HASH = "f89c497f185f09d4b933a7d8a1abede6a47e020774acf1363fde0872e0881812a60a87d983dcef2324414d1751625c408803c9c595d72ee276d293ed3b1fec51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-GooseMPL \
python3.11dist-goosempl \
python311-GooseMPL \
python3dist-goosempl"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML \
python311-deprecation \
python311-matplotlib \
python311-matplotlib-latex \
python311-numpy \
python311-scipy \
texlive-amsfonts \
texlive-amsmath \
texlive-tools"

inherit rpm
