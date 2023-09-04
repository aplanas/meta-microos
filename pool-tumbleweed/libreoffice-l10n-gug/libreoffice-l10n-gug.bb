SUMMARY = "Paraguayan_Guaraní localization files for LibreOffice"
DESCRIPTION = "Provides Paraguayan_Guaraní translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-gug-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "cc5cf4e5b1f449392c36df01144ede53f9b41218343564504dd59629be192f7d6d70d9c6a159686f6c074eeaa1f4db5212394595be2568ed2006ea5ba5089f8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gug \
libreoffice-l10n-gug \
locale-libreoffice-gug"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-gug"

inherit rpm
