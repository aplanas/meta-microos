SUMMARY = "The BitTorrent bencode module as light-weight, standalone package"
DESCRIPTION = "This package simply re-packages the existing bencoding and bdecoding \
implemention from the 'official' BitTorrent client as a separate, \
leight-weight package for re-using them without having the entire \
BitTorrent software as a dependency."
LICENSE = "BitTorrent-1.1"

PV = "4.0.0"

RPM_NAME = "python310-bencode-4.0.0-1.4.noarch.rpm"
RPM_HASH = "3f3c061b6c10470db94a9133557cd669386ddabd3d19aed2cda3c1f247e2d3053c40fe31c71fd5f468edca2b70feb4c957448612a9d8f0d7b44e01b409754357"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bencode.py \
python310-bencode \
python3dist-bencode.py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
