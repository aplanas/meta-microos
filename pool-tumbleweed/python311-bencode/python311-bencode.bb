SUMMARY = "The BitTorrent bencode module as light-weight, standalone package"
DESCRIPTION = "This package simply re-packages the existing bencoding and bdecoding \
implemention from the 'official' BitTorrent client as a separate, \
leight-weight package for re-using them without having the entire \
BitTorrent software as a dependency."
LICENSE = "BitTorrent-1.1"

PV = "4.0.0"

RPM_NAME = "python311-bencode-4.0.0-1.4.noarch.rpm"
RPM_HASH = "1b9a36cd83fdbfa72ae0dd638c93ca13a242de5d0598f9d33747927261a9f850af56e23d973f0bf78b7a7de59af182193173bfe4db3aea06c1a17f712b5fa52d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bencode \
python3.11dist-bencode.py \
python311-bencode \
python3dist-bencode.py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
