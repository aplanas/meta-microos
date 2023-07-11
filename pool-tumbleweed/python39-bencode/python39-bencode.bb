SUMMARY = "The BitTorrent bencode module as light-weight, standalone package"
DESCRIPTION = "This package simply re-packages the existing bencoding and bdecoding \
implemention from the 'official' BitTorrent client as a separate, \
leight-weight package for re-using them without having the entire \
BitTorrent software as a dependency."
LICENSE = "BitTorrent-1.1"

PV = "4.0.0"

RPM_NAME = "python39-bencode-4.0.0-1.4.noarch.rpm"
RPM_HASH = "e6a83e80ba94a25d89d01e9637e1623edb8c6c4efbce40aa9a4ba6c17a835022e33ff5ac6b9a7303ba1fd0f277d41180bc735ea63d674f6f155d8fb5b179a2d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bencode.py \
python39-bencode \
python3dist-bencode.py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
