SUMMARY = "Kurdish localization files for LibreOffice"
DESCRIPTION = "Provides Kurdish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-kmr_Latn-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "d2082c00e7e10dd3129a2877b2273475db00957a3d3b8ba1eb8e0b46559f6677e102787848a982ed2bb20272c8927dd6aed06e6999bdd6bd1c9e097f577b3362"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kmr-Latn \
libreoffice-l10n-kmr-Latn \
locale-libreoffice-kmr-Latn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-kmr-Latn"

inherit rpm
