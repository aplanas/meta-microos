SUMMARY = "Lower_Sorbian localization files for LibreOffice"
DESCRIPTION = "Provides Lower_Sorbian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-dsb-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "f059ec469137e1bf925df7ca2f7840a8a385cb86067c988995d4a12d8701d2b0990811216f4232e225e4cfdf6665a8172735ccc01bc63c532ae030c196add24a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-dsb \
libreoffice-l10n-dsb \
locale-libreoffice-dsb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
