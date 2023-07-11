SUMMARY = "Kabyle localization files for LibreOffice"
DESCRIPTION = "Provides Kabyle translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-kab-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "c9562dbed4a383007a8eb6c6f44a91f224abcdbd080a72dbebbedebc2d3c7bbc300fa6dcd314003bc177d5bbc812103fdb63531624fbc91a53a84a4e24ff7d70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kab \
libreoffice-l10n-kab \
locale-libreoffice-kab"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
