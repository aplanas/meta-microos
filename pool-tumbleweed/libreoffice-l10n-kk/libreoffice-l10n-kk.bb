SUMMARY = "Kazakh localization files for LibreOffice"
DESCRIPTION = "Provides Kazakh translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-kk-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "86160495e4ed3d1aee5b1430d954f4137cf463c6a02d7a82015404ea81e07c0a0776369ccfa065f23e67b0df63f2333fd157210296882291b63d2ff4172b4eb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kk \
libreoffice-l10n-kk \
locale-libreoffice-kk"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
