SUMMARY = "Python library for reading/writing TMX tile files"
DESCRIPTION = "This library reads and writes the Tiled TMX format. \
This is useful for map editors or generic level editors like \
Tiled to edit a game's levels."
LICENSE = "Apache-2.0"

PV = "1.10"

RPM_NAME = "python39-tmx-1.10-3.14.noarch.rpm"
RPM_HASH = "6a7608d283e6b36e0333a3473a5df70140054ed902b37dc6de349c39a8acb28ddbb24f935745b9861e6c81153fd808fa133cd7216bc81ae64bc8db1f6a61a516"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(tmx) \
python39-tmx \
python3dist(tmx)"
RDEPENDS:${PN} += "python(abi) \
python39-six"

inherit rpm
