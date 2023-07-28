SUMMARY = "Russian localization files for LibreOffice"
DESCRIPTION = "Provides Russian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ru-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "2c1af931fcd5b6a24ee68fefeb34d3f2659621338ed1e762a99d8e4358f47916066e5779108014641ca17addc4b9dbf665ab09b8493e00c7629e3e1e5671b064"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ru \
libreoffice-l10n-ru \
locale-libreoffice-ru"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ru-RU"

inherit rpm
