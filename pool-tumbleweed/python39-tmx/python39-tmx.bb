SUMMARY = "Python library for reading/writing TMX tile files"
DESCRIPTION = "This library reads and writes the Tiled TMX format. \
This is useful for map editors or generic level editors like \
Tiled to edit a game's levels."
LICENSE = "Apache-2.0"

PV = "1.10"

RPM_NAME = "python39-tmx-1.10-3.15.noarch.rpm"
RPM_HASH = "5edc6f8e218a97d8f5e2f2f26537930d71ba76c3cd6106c74031d8a06e9d42485fceb2c4cc26055de2b2776960ac2bbe0fed8f0f363e9d6132e8920024e0916f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tmx \
python39-tmx \
python3dist-tmx"

RDEPENDS:${PN} += "python-abi \
python39-six"

inherit rpm
