SUMMARY = "Oromo localization files for LibreOffice"
DESCRIPTION = "Provides Oromo translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-om-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "38512eb8377deae31374045e981a2b2a6ded1c0e82e0f82a2eacc4e1b76a3465e3460ae64618c26926bb3640463984fc2d29d963da85e7e651582786a033ac1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-om \
libreoffice-l10n-om \
locale-libreoffice-om"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
