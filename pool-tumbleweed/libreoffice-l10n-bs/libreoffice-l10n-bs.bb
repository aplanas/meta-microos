SUMMARY = "Bosnian localization files for LibreOffice"
DESCRIPTION = "Provides Bosnian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-bs-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "e9b51f01acd7e76eb934e50a462e1a11c3728c86dc726cb8a2b9703307b096b943962963c24e36de66675634074ac599a828be4c01ee015cfc4d098dd47756b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bs \
libreoffice-l10n-bs \
locale-libreoffice-bs"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
