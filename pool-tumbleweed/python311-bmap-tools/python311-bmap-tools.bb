SUMMARY = "Tools to generate block map (AKA bmap) and flash images using bmap"
DESCRIPTION = "Bmaptool is a generic tool for creating the block map (bmap) for a file, and copying files \
using the block map. The idea is that large file containing unused blocks, like \
raw system image files, can be copied or flashed a lot faster with bmaptool \
than with traditional tools like 'dd' or 'cp'."
LICENSE = "GPL-2.0-only"

PV = "3.6"

RPM_NAME = "python311-bmap-tools-3.6-2.5.noarch.rpm"
RPM_HASH = "78ee3e2dadd05172531f5140b65c4ecf6639c70510a334e59eb81c8f3c0bef048e1357e2750da056fd828ac77cde7713d6b8c77f4e2cfac769b161a157ecfa20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bmap-tools \
python3.11dist-bmap-tools \
python311-bmap-tools \
python3dist-bmap-tools"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-gpg \
update-alternatives"

inherit rpm
