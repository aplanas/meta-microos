SUMMARY = "Manipuri localization files for LibreOffice"
DESCRIPTION = "Provides Manipuri translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-mni-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "c3470afd1ef2112c0905c1b1acd8b2b76e835af3d0b3a564335bdd0991682ed361cdbb09b7ee88e2535a61d3da4dcaf2fdaeb4ebfdb253ad446c0d4298dd4457"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mni \
libreoffice-l10n-mni \
locale-libreoffice-mni"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
