SUMMARY = "Color palettes for Python"
DESCRIPTION = "Palettable (formerly brewer2mpl) is a library of color palettes for Python. \
It's written in pure Python with no dependencies, but it can supply color maps \
for matplotlib. You can use Palettable to customize matplotlib plots or supply \
colors for a web application."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python310-palettable-3.3.0-1.19.noarch.rpm"
RPM_HASH = "8b6298a9a0ef0003bd17f3aa2fe3fd7cb9be9a150704078b2845b30f69decb214829e36bdae5efcdf77dbc400d21a99c4b8df88b8147bd2ac21c87b2009a2524"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-palettable \
python3.10dist(palettable) \
python310-palettable \
python3dist(palettable)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
