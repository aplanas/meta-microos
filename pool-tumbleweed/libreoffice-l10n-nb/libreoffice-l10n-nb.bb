SUMMARY = "Bokmal localization files for LibreOffice"
DESCRIPTION = "Provides Bokmal translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-nb-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "5d1f1e6f9aa941fd1c147a365e3f4405fcfb35ada5eac75e876981086cd29d985266765e5cb4186100fe47e5f758d3de0c1e66b953d6484678f888dacb356b9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nb \
libreoffice-l10n-nb \
locale-libreoffice-nb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-no"

inherit rpm
