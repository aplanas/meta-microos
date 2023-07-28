SUMMARY = "Bosnian localization files for LibreOffice"
DESCRIPTION = "Provides Bosnian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-bs-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "5b285f048c38f8c063e6fb18a33038e5193005a999f5d1184e4f7a16bfa7611d0abdf2eb74e6a5be93b0d1152879b960c4d7673b6711fc685b17a6f5d8e0257a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bs \
libreoffice-l10n-bs \
locale-libreoffice-bs"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
