SUMMARY = "Kazakh localization files for LibreOffice"
DESCRIPTION = "Provides Kazakh translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-kk-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "e6bf7b228a98496ed84369fa7f8b707a29b940bd47daad960eac763efa71c4464a5654e40785cad2b8e60bbbae963299d60aaee19bd7a0c848bfa7b7544e68ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kk \
libreoffice-l10n-kk \
locale-libreoffice-kk"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
