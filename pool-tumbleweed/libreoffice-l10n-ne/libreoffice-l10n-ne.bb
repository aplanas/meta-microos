SUMMARY = "Nepali localization files for LibreOffice"
DESCRIPTION = "Provides Nepali translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-ne-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "a5535866090519cc583d717a5591b5ed85b6330928ffe31dc32ac6c9e6785b4b99f666604bb283491ea2ae47cee15e4613ccb58d319bb408dfbca37ed96b9b46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ne \
libreoffice-l10n-ne \
locale-libreoffice-ne"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ne-NP"

inherit rpm
