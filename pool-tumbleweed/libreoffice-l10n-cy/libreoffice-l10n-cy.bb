SUMMARY = "Welsh localization files for LibreOffice"
DESCRIPTION = "Provides Welsh translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-cy-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "a4e3f299e49aa10138db98bd73df18facbaab0320ac517518b6dc1ffcc1a5dd08ffe38adaf60c1a1e740c3f3bace516d64174a0d449cbde9cff433bd765b1528"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-cy \
libreoffice-l10n-cy \
locale-libreoffice-cy"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
