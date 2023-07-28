SUMMARY = "Paraguayan_Guaraní localization files for LibreOffice"
DESCRIPTION = "Provides Paraguayan_Guaraní translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-gug-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "75756592cffaef1847ce042540c18d55d40466f36bf36cd3960d57c570f8b81cf4eb97f204c4d0e9ce93eb535fb640512d9dbe4f7cfdb5d80286e1e1e9b072a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gug \
libreoffice-l10n-gug \
locale-libreoffice-gug"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-gug"

inherit rpm
