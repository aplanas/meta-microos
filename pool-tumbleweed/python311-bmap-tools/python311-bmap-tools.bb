SUMMARY = "Tools to generate block map (AKA bmap) and flash images using bmap"
DESCRIPTION = "Bmaptool is a generic tool for creating the block map (bmap) for a file, and copying files \
using the block map. The idea is that large file containing unused blocks, like \
raw system image files, can be copied or flashed a lot faster with bmaptool \
than with traditional tools like 'dd' or 'cp'."
LICENSE = "GPL-2.0-only"

PV = "3.6"

RPM_NAME = "python311-bmap-tools-3.6-2.3.noarch.rpm"
RPM_HASH = "b7cbb8ca18e26a192a30a1ed7a077e9fb9ae1c21d69c54b5e394f1f413908e2a1e08b12be31b1c39611b037e8219b0c4bd217fc12f45b51537ffea2379b11a70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-bmap-tools \
python311-bmap-tools \
python3dist-bmap-tools"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-gpg \
update-alternatives"

inherit rpm
