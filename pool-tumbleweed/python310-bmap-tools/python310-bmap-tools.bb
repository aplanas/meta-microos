SUMMARY = "Tools to generate block map (AKA bmap) and flash images using bmap"
DESCRIPTION = "Bmaptool is a generic tool for creating the block map (bmap) for a file, and copying files \
using the block map. The idea is that large file containing unused blocks, like \
raw system image files, can be copied or flashed a lot faster with bmaptool \
than with traditional tools like 'dd' or 'cp'."
LICENSE = "GPL-2.0-only"

PV = "3.6"

RPM_NAME = "python310-bmap-tools-3.6-2.3.noarch.rpm"
RPM_HASH = "215a7d08e8e1330f67f0c779d6a73a95118117a40ec3e8f3ff1ab73603c62c97223c685e2a538fe449890e270637d3f11a02e07cd31766b6cf5c0f58802b5508"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bmap-tools \
python3.10dist-bmap-tools \
python310-bmap-tools \
python3dist-bmap-tools"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-gpg \
update-alternatives"

inherit rpm
