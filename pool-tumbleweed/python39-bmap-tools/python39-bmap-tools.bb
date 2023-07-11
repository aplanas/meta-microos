SUMMARY = "Tools to generate block map (AKA bmap) and flash images using bmap"
DESCRIPTION = "Bmaptool is a generic tool for creating the block map (bmap) for a file, and copying files \
using the block map. The idea is that large file containing unused blocks, like \
raw system image files, can be copied or flashed a lot faster with bmaptool \
than with traditional tools like 'dd' or 'cp'."
LICENSE = "GPL-2.0-only"

PV = "3.6"

RPM_NAME = "python39-bmap-tools-3.6-2.5.noarch.rpm"
RPM_HASH = "30aa601386e23635bee9f50489da179c7af43bfa190554abcca30db7c5710cf232e6926ecfd8bf2d82f6de6f824fda9384181678530e0942db1e7b86e4e4a6e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bmap-tools \
python39-bmap-tools \
python3dist-bmap-tools"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-gpg \
update-alternatives"

inherit rpm
