SUMMARY = "Color palettes for Python"
DESCRIPTION = "Palettable (formerly brewer2mpl) is a library of color palettes for Python. \
It's written in pure Python with no dependencies, but it can supply color maps \
for matplotlib. You can use Palettable to customize matplotlib plots or supply \
colors for a web application."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python311-palettable-3.3.0-1.21.noarch.rpm"
RPM_HASH = "35293ed3a9ee16b8962aa8bdd01d0f1894782e9b1887910a2fe8c653f2be5cf32023ac43a0709b7e7ed6059eafe8e9e3a9da48819de29f95557a4162dd4e2167"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-palettable \
python3.11dist-palettable \
python311-palettable \
python3dist-palettable"

RDEPENDS:${PN} += "python-abi"

inherit rpm
