SUMMARY = "Python library to apply true color for terminal text"
DESCRIPTION = "A Python library to apply true color for terminal text."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python39-tcolorpy-0.1.2-1.5.noarch.rpm"
RPM_HASH = "4096f28d286669df3f6fc378e3fc6c71a2f47dd7d3bd5e896eed047c78d80de9f6d26bb0c9bbbc1cc4615a45705b70457bc5ab251a00ce410bf4a882fe5d69de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tcolorpy \
python39-tcolorpy \
python3dist-tcolorpy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
