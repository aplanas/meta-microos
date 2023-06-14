SUMMARY = "Style and extension functions for matplotlib"
DESCRIPTION = "GooseMPL provides a style and several style extensions for matplotlib, some custom \
functions that extend matplotlib, and several examples to make professional plot \
using matplotlib."
LICENSE = "MIT"

PV = "0.12.1"

RPM_NAME = "python39-GooseMPL-0.12.1-1.3.noarch.rpm"
RPM_HASH = "5ecbb8e9b9f6e54a1cfb862ee0458726981038f37b45612655679686952728f9e37a0966e9b58935e0f25ed5c014f75557615563ea88794b30df319bbe8ebc82"
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
