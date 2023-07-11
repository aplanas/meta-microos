SUMMARY = "Paraguayan_Guaraní localization files for LibreOffice"
DESCRIPTION = "Provides Paraguayan_Guaraní translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-gug-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "227db6908922770b126f5524ae20217939440e3905eeab8d4388ca3c85ebaefcdd50069147f76712fa2e35da413f4d5999de5a06a7f50c436f10038f3d058aba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gug \
libreoffice-l10n-gug \
locale-libreoffice-gug"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-gug"

inherit rpm
