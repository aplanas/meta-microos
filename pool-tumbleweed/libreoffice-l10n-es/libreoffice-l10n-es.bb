SUMMARY = "Spanish localization files for LibreOffice"
DESCRIPTION = "Provides Spanish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-es-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "5fe2388019bf8d91380345d20289d3887116a4d214cb692d11681ca642cd0839a0ee039cede069b3c423c32583a8d754f3a055d1132ff94d2032be8911c5e566"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-es \
libreoffice-l10n-es \
locale-libreoffice-es"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-es"

inherit rpm
