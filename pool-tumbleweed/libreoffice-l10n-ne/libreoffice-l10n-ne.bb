SUMMARY = "Nepali localization files for LibreOffice"
DESCRIPTION = "Provides Nepali translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ne-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "d95ad1d22b61005eb56434032ab396191b2739825c2baa9dc22df90e7ee631f04068024067d1c57d3bf918f8a95b2395bc318b3deb11b52d674c2cd0c2a6f2c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ne \
libreoffice-l10n-ne \
locale-libreoffice-ne"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ne-NP"

inherit rpm
