SUMMARY = "Python library for reading/writing TMX tile files"
DESCRIPTION = "This library reads and writes the Tiled TMX format. \
This is useful for map editors or generic level editors like \
Tiled to edit a game's levels."
LICENSE = "Apache-2.0"

PV = "1.10"

RPM_NAME = "python310-tmx-1.10-3.15.noarch.rpm"
RPM_HASH = "8ccaf41b3c704e225adbbc5cd52043465764b5dfa5ef0a3d1dcff85fce669f339b244a946ef4de965faa3c228bb8fc5e0ad25266b4a05722444448b842d9d333"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tmx \
python310-tmx \
python3dist-tmx"

RDEPENDS:${PN} += "python-abi \
python310-six"

inherit rpm
