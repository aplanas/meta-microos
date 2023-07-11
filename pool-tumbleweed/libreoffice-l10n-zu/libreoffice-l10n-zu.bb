SUMMARY = "Zulu localization files for LibreOffice"
DESCRIPTION = "Provides Zulu translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-zu-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "5f4ea262063de06f8e1b7d3643527f050d66833240d93438ed44312d69530737f6c902ff87db3f4f6036dc341c4e5bb41a46a818495bb41550fc29ef372181f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-zu \
libreoffice-l10n-zu \
locale-libreoffice-zu"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-zu-ZA"

inherit rpm
