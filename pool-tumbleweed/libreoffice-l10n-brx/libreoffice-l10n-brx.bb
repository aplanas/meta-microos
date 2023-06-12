SUMMARY = "Bodo localization files for LibreOffice"
DESCRIPTION = "Provides Bodo translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-brx-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "2562b8dda0bc1921e6e27d75be14499bdd1895ebe89a4ff9bc9384d60479bd85811aa4bcbc3c07e1c417f88ee5e20a8612127f75c2d5dcf6b673fa25f5fd96b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-brx \
libreoffice-l10n-brx \
locale(libreoffice:brx)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
