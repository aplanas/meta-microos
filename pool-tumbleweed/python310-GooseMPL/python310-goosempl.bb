SUMMARY = "Style and extension functions for matplotlib"
DESCRIPTION = "GooseMPL provides a style and several style extensions for matplotlib, some custom \
functions that extend matplotlib, and several examples to make professional plot \
using matplotlib."
LICENSE = "MIT"

PV = "0.12.1"

RPM_NAME = "python310-GooseMPL-0.12.1-1.5.noarch.rpm"
RPM_HASH = "6994335990eccd6c8ba9cf245e4ff2d985e3dfa5f370d9241d74c378298d067ba83cbc4c9d0a7c6131c734ffeb76f63ba597d1d158e33ffae7dabedd94fdab87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-goosempl \
python310-GooseMPL \
python3dist-goosempl"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML \
python310-deprecation \
python310-matplotlib \
python310-matplotlib-latex \
python310-numpy \
python310-scipy \
texlive-amsfonts \
texlive-amsmath \
texlive-tools"

inherit rpm
