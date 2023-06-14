SUMMARY = "The BitTorrent bencode module as light-weight, standalone package"
DESCRIPTION = "This package simply re-packages the existing bencoding and bdecoding \
implemention from the 'official' BitTorrent client as a separate, \
leight-weight package for re-using them without having the entire \
BitTorrent software as a dependency."
LICENSE = "BitTorrent-1.1"

PV = "4.0.0"

RPM_NAME = "python310-bencode-4.0.0-1.2.noarch.rpm"
RPM_HASH = "edaa9b8a1c14ca9ff5428952430e48e4fa99fe25f44b95b94748753964e98f260adbf05518a8e819d71637a6db149fe9d17bfb6f591c50ba8be253600d045b19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bencode \
python3.10dist-bencode.py \
python310-bencode \
python3dist-bencode.py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
