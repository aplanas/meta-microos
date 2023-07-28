SUMMARY = "Konkani localization files for LibreOffice"
DESCRIPTION = "Provides Konkani translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-kok-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "30e103e79521b2b485e6fe901f8340861ee12ade04980c831da4770d483711120e615d50b671aa06acb7ac3439f0383caaba1137078bedd4f1f1a54cd68908fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kok \
libreoffice-l10n-kok \
locale-libreoffice-kok"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
