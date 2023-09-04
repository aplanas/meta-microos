SUMMARY = "Swati localization files for LibreOffice"
DESCRIPTION = "Provides Swati translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-ss-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "ec7610adbe9b786c2b1b098e34a3eff124729606a773488cecfd01767165785c93728b044b5abb5bcac0190110c0d52c13b70bae25a9e7daf98780a6287ab26c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ss \
libreoffice-l10n-ss \
locale-libreoffice-ss"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
