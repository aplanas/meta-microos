SUMMARY = "Portuguese localization files for LibreOffice"
DESCRIPTION = "Provides Portuguese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-pt_PT-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "3b532aa8b56b84db5fa60f6b20a8517ee1446eeaf4d48debdc083c68306c7d6884b68c16c86093d59c50b145c9857cebc0a4217545f1cf3c2192e1abbaf6c1dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pt \
libreoffice-help-pt-PT \
libreoffice-l10n-pt \
libreoffice-l10n-pt-PT \
locale-libreoffice-pt-PT"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-pt-PT"

inherit rpm
