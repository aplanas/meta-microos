SUMMARY = "Tsonga localization files for LibreOffice"
DESCRIPTION = "Provides Tsonga translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ts-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "c1312fdb12471745c343434ccf7f1cb5265e1a33fe29b28c13814bfb3d79431b45f97ba39dd2e7d8bbb56628fe4244679f91da4a73148d2458f8e09a5b38f37f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ts \
libreoffice-l10n-ts \
locale-libreoffice-ts"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
