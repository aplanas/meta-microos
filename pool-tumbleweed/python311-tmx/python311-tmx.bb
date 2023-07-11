SUMMARY = "Python library for reading/writing TMX tile files"
DESCRIPTION = "This library reads and writes the Tiled TMX format. \
This is useful for map editors or generic level editors like \
Tiled to edit a game's levels."
LICENSE = "Apache-2.0"

PV = "1.10"

RPM_NAME = "python311-tmx-1.10-3.15.noarch.rpm"
RPM_HASH = "464dbaab186d76045081e48c2582b62fb1ce4de84a02c0dafd75c640ddee5de97a6fcbe2bbba0c183e1f562c2d6fefa4334e3a26272066d9539078977949c58c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tmx \
python3.11dist-tmx \
python311-tmx \
python3dist-tmx"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
