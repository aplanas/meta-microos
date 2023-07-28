SUMMARY = "Zulu localization files for LibreOffice"
DESCRIPTION = "Provides Zulu translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-zu-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "88d00934956806332d038c2ecadffc4ba0d1f5fd51114b45a2bdc5fa4df416f526f80b90e5f39f30187244fea55a77da0e4c38a35226a94b75ab021057275072"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-zu \
libreoffice-l10n-zu \
locale-libreoffice-zu"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-zu-ZA"

inherit rpm
