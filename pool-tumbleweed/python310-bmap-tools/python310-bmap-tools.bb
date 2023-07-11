SUMMARY = "Tools to generate block map (AKA bmap) and flash images using bmap"
DESCRIPTION = "Bmaptool is a generic tool for creating the block map (bmap) for a file, and copying files \
using the block map. The idea is that large file containing unused blocks, like \
raw system image files, can be copied or flashed a lot faster with bmaptool \
than with traditional tools like 'dd' or 'cp'."
LICENSE = "GPL-2.0-only"

PV = "3.6"

RPM_NAME = "python310-bmap-tools-3.6-2.5.noarch.rpm"
RPM_HASH = "cd3bed4239e9cbdef44c413137bc258b441fc8088d40ee162271f24acc1f426875087c5068c9ee5a2fc048a8892486ed6c5a1e24ffd4ee835c5a482950516523"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bmap-tools \
python310-bmap-tools \
python3dist-bmap-tools"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-gpg \
update-alternatives"

inherit rpm
