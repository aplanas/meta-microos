SUMMARY = "Thai localization files for LibreOffice"
DESCRIPTION = "Provides Thai translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-th-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "cef982454c8321e6dfb627054fa038bcbd3739c9493855b6ca1bd0e1118dc1b5b3669aa8891ea565063b8aa29b55373437786a5f4617d4f67d15f98a05d798af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-th \
libreoffice-l10n-th \
locale-libreoffice-th"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-th-TH"

inherit rpm
