SUMMARY = "Script to link/unlink files to libreoffice home"
DESCRIPTION = "Script that links and unlinks files from /usr/share to libreoffice \
home as libreoffice layout is not set up for noarch packages otherwise."
LICENSE = "MIT"

PV = "1"

RPM_NAME = "libreoffice-share-linker-1-6.1.noarch.rpm"
RPM_HASH = "c94e7ad556fa86be35415626a321011312fa1603b0b6f11410e6e005cd784a0ddb545786a512747f36deaca69dc3cee5253372a51bc5e9e57a908dc2da39e8a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-share-linker"

RDEPENDS:${PN} += "/usr/bin/env \
python3"

inherit rpm
