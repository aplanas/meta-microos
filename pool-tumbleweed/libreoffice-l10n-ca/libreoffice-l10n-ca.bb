SUMMARY = "Catalan localization files for LibreOffice"
DESCRIPTION = "Provides Catalan translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ca-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "e99d7438bcbaee4a0d0fab9f798a3d5fef244adabd447f4d1f6237869c8b77541b8ab810fa0785702bc9851789ba720afdac1e3c31a9632022e682417c1a815e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ca \
libreoffice-l10n-ca \
locale-libreoffice-ca"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ca"

inherit rpm
