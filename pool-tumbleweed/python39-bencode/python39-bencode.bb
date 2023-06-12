SUMMARY = "The BitTorrent bencode module as light-weight, standalone package"
DESCRIPTION = "This package simply re-packages the existing bencoding and bdecoding \
implemention from the 'official' BitTorrent client as a separate, \
leight-weight package for re-using them without having the entire \
BitTorrent software as a dependency."
LICENSE = "BitTorrent-1.1"

PV = "4.0.0"

RPM_NAME = "python39-bencode-4.0.0-1.2.noarch.rpm"
RPM_HASH = "51155ecffb2ee1d9fa4ba0c97e4067d8b381f327cbc549a163c603e70edc6995f1c5cd81f1bb2f30548da3a70b8d60a4676011749bdf5010669cb05e9dd48475"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(bencode.py) \
python39-bencode \
python3dist(bencode.py)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
