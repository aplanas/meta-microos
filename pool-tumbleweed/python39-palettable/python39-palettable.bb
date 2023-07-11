SUMMARY = "Color palettes for Python"
DESCRIPTION = "Palettable (formerly brewer2mpl) is a library of color palettes for Python. \
It's written in pure Python with no dependencies, but it can supply color maps \
for matplotlib. You can use Palettable to customize matplotlib plots or supply \
colors for a web application."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python39-palettable-3.3.0-1.21.noarch.rpm"
RPM_HASH = "e05121cbac34cc968337eeef22e7abb76cee1c4371966d3176fa0a8ecb522babe5adfb934537f161e8f29aff4cb3d4f5ca6c7783e76966bf1098cb1bc98c7836"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-palettable \
python39-palettable \
python3dist-palettable"

RDEPENDS:${PN} += "python-abi"

inherit rpm
