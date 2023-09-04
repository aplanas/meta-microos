SUMMARY = "Script to link/unlink files to libreoffice home"
DESCRIPTION = "Script that links and unlinks files from /usr/share to libreoffice \
home as libreoffice layout is not set up for noarch packages otherwise."
LICENSE = "MIT"

PV = "1"

RPM_NAME = "libreoffice-share-linker-1-7.1.noarch.rpm"
RPM_HASH = "c32fd990d3db4360718cbbd833aebb9a52d852441cb4450f2d2e99e7e4d82b448faacb60ef4d753a2b81d37baaf5c0638d029c7a141943b159c7e9b0d300fb67"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-share-linker"

RDEPENDS:${PN} += "/usr/bin/env \
python3"

inherit rpm
