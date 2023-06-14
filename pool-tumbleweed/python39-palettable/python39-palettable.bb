SUMMARY = "Color palettes for Python"
DESCRIPTION = "Palettable (formerly brewer2mpl) is a library of color palettes for Python. \
It's written in pure Python with no dependencies, but it can supply color maps \
for matplotlib. You can use Palettable to customize matplotlib plots or supply \
colors for a web application."
LICENSE = "MIT"

PV = "3.3.0"

RPM_NAME = "python39-palettable-3.3.0-1.19.noarch.rpm"
RPM_HASH = "91127ac8778dc7cf5cdd7d075a6771b6e8404039a9f1b0e9194ddb031664e8dc5c83bd1a7bb27ef467d55e4e13706c5da96146dca6e6e134eadb3b3815954748"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-palettable \
python39-palettable \
python3dist-palettable"

RDEPENDS:${PN} += "python-abi"

inherit rpm
