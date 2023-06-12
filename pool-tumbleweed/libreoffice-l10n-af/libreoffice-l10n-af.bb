SUMMARY = "Afrikaans localization files for LibreOffice"
DESCRIPTION = "Provides Afrikaans translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-af-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "88fd16ed7593f59ea9408535fc4bd05239d8c192c653028b13a5a99366c71eba21bd2b18600a3e8e392443ea5eb719523998b59c3d696c1ac19b65af9a469834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-af \
libreoffice-l10n-af \
locale(libreoffice:af)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-af_ZA"

inherit rpm
