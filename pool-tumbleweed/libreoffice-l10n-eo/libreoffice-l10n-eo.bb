SUMMARY = "Esperanto localization files for LibreOffice"
DESCRIPTION = "Provides Esperanto translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-eo-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "975b36bd760bc61bacdb69264e5dfcf614089b9bab96f4c6f49ded4370ca27bd31e17c3ae014664c892626320c0c2378f72b993d2667ecbadd12277d595d7857"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-eo \
libreoffice-l10n-eo \
locale-libreoffice-eo"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
