SUMMARY = "Style and extension functions for matplotlib"
DESCRIPTION = "GooseMPL provides a style and several style extensions for matplotlib, some custom \
functions that extend matplotlib, and several examples to make professional plot \
using matplotlib."
LICENSE = "MIT"

PV = "0.12.1"

RPM_NAME = "python39-GooseMPL-0.12.1-1.5.noarch.rpm"
RPM_HASH = "1dae13f71133164c991e3ece1790f45b3de14eaba63e95e6318896ff0f87237d6218d3009db9a8a14c0bf4479088222fd7f8188c1a15a625677128af62b32548"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-goosempl \
python39-GooseMPL \
python3dist-goosempl"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML \
python39-deprecation \
python39-matplotlib \
python39-matplotlib-latex \
python39-numpy \
python39-scipy \
texlive-amsfonts \
texlive-amsmath \
texlive-tools"

inherit rpm
