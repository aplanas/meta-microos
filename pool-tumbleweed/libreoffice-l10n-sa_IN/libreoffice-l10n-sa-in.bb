SUMMARY = "Sanskrit localization files for LibreOffice"
DESCRIPTION = "Provides Sanskrit translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-sa_IN-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "aac665e794f109a7a0fcbc22e6d4d7919a2feab9259b6e644682d7dd7976b6d43e0bb7038616de870eb173c58e49af0ca20c0cd4f63e59cd69d30a2cf47dfeac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sa-IN \
libreoffice-l10n-sa-IN \
locale-libreoffice-sa-IN"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
