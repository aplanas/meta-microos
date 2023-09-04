SUMMARY = "Tibetian localization files for LibreOffice"
DESCRIPTION = "Provides Tibetian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-bo-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "ce9c8fd2f9e1daeba9a7ad6eb7409ca250c64bbfa7ad0a51ce4819aa130f9263766b032bf42f78a4ef5fc196b13f7ad329be694dec8adb610af27ed8aace6d88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bo \
libreoffice-l10n-bo \
locale-libreoffice-bo"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-bo"

inherit rpm
