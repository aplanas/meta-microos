SUMMARY = "Kazakh localization files for LibreOffice"
DESCRIPTION = "Provides Kazakh translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-kk-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "820650148a4892db4c4b1535ece3055bb28ec93755cfa88de44afe3f7fd2efa21192670e9c78cd56de8864c723ca005964fd792700b5ef4c39f94a31dd7b15be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kk \
libreoffice-l10n-kk \
locale-libreoffice-kk"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
