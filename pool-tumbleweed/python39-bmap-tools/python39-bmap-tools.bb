SUMMARY = "Tools to generate block map (AKA bmap) and flash images using bmap"
DESCRIPTION = "Bmaptool is a generic tool for creating the block map (bmap) for a file, and copying files \
using the block map. The idea is that large file containing unused blocks, like \
raw system image files, can be copied or flashed a lot faster with bmaptool \
than with traditional tools like 'dd' or 'cp'."
LICENSE = "GPL-2.0-only"

PV = "3.6"

RPM_NAME = "python39-bmap-tools-3.6-2.3.noarch.rpm"
RPM_HASH = "3c151114227f59b4e7b3a0d4d0806c8ac0fbedc9e9aca8c69f2a2f1c605f29d0c03d6e9c747079235092baec15c6c1b6d83afa93f7f87ba5f27eb954b76babf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(bmap-tools) \
python39-bmap-tools \
python3dist(bmap-tools)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
python(abi) \
python39-gpg \
update-alternatives"

inherit rpm
