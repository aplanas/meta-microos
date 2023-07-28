SUMMARY = "French localization files for LibreOffice"
DESCRIPTION = "Provides French translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-fr-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "7d31714ba5c5ec8f097201b7c78b204e4d7dabfea4435bc435cd37ed19efef70368d24153d63f0bc25a94a5b57d378adcb5771eff832df8dec5450dbd12f38ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fr \
libreoffice-l10n-fr \
locale-libreoffice-fr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-fr-FR"

inherit rpm
