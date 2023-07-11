SUMMARY = "Gujarati localization files for LibreOffice"
DESCRIPTION = "Provides Gujarati translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-gu-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "ba3bd046ae5c060c9b8dfd2b06c180553df3c39e16d9515aa2eb48198cbe465a5fa28f1c2ea30b8211b4be3566d3834951ee80ad1fed283b2f754bd5bcfa7986"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gu \
libreoffice-help-gu-IN \
libreoffice-l10n-gu \
libreoffice-l10n-gu-IN \
locale-libreoffice-gu"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-gu-IN"

inherit rpm
