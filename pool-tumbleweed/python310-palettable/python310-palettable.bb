SUMMARY = "Color palettes for Python"
DESCRIPTION = "Palettable (formerly brewer2mpl) is a library of color palettes for Python. \
It's written in pure Python with no dependencies, but it can supply color maps \
for matplotlib. You can use Palettable to customize matplotlib plots or supply \
colors for a web application."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python310-palettable-3.3.0-1.21.noarch.rpm"
RPM_HASH = "a8263c77b5e5dbf761b327447df14ee2f74c76d1ef54c592ddf1712c1526b3265fab4e2ae7965ace753cac8ea454926531fb29b6c5baeb15b00931658db7a72d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-palettable \
python310-palettable \
python3dist-palettable"

RDEPENDS:${PN} += "python-abi"

inherit rpm
