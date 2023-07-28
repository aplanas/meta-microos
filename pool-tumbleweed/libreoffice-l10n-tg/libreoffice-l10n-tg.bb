SUMMARY = "Tajik localization files for LibreOffice"
DESCRIPTION = "Provides Tajik translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-tg-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "c47b356af7df9932f02800cd16ccb7a07d18599876e11dc169e56dcfb27c94c71fd171c8ff8ca4e2f80c7148f39b79d85e823ed0f2020f952957c62289e5c207"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tg \
libreoffice-l10n-tg \
locale-libreoffice-tg"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
