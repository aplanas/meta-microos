SUMMARY = "Vietnamese localization files for LibreOffice"
DESCRIPTION = "Provides Vietnamese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-vi-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "24b18bd8892cee0d9a73ba4fe63443bc5a510da7aa46e22d9e4fc3a30bd9ca4c53f079bde021773f6147590e0945ae6d8430fa1cb5a0f664e344b64bf85d57f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-vi \
libreoffice-l10n-vi \
locale-libreoffice-vi"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-vi"

inherit rpm
