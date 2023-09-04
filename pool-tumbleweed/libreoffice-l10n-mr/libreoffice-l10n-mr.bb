SUMMARY = "Marathi localization files for LibreOffice"
DESCRIPTION = "Provides Marathi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-mr-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "331bac354a6783b20347a93ab09dcfab28e19d5d8c5494d4090537d1e1ab754f0aa6b190a9fc1f2706476114357a64fad99e1ced5ad9d0e429b12b5a58b77cc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mr \
libreoffice-l10n-mr \
locale-libreoffice-mr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
