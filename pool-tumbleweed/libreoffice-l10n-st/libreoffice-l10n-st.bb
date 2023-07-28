SUMMARY = "Southern_Sotho localization files for LibreOffice"
DESCRIPTION = "Provides Southern_Sotho translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-st-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "08ba498670b126a4d0c3d0e73e3a663163df1f67e43f51d427ec9799e8f5f817a962c9e62936d67fd4afb9074bcc1e942c35712a4cce8ccb53863d733c91032d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-st \
libreoffice-l10n-st \
locale-libreoffice-st"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
