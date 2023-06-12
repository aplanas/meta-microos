SUMMARY = "Python library for reading/writing TMX tile files"
DESCRIPTION = "This library reads and writes the Tiled TMX format. \
This is useful for map editors or generic level editors like \
Tiled to edit a game's levels."
LICENSE = "Apache-2.0"

PV = "1.10"

RPM_NAME = "python310-tmx-1.10-3.14.noarch.rpm"
RPM_HASH = "6008a120cde882ac9df3e17bc2849ea1bd37c78fda87f11df4003c0d067b41914e636b47bf3d733dc24ef94869e2a97f21c465858c3ea811a9677f98484ce3af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tmx \
python3.10dist(tmx) \
python310-tmx \
python3dist(tmx)"
RDEPENDS:${PN} += "python(abi) \
python310-six"

inherit rpm
