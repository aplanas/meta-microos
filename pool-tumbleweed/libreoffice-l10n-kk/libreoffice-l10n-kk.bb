SUMMARY = "Kazakh localization files for LibreOffice"
DESCRIPTION = "Provides Kazakh translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-kk-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "564690a109796a3302608897f9d17fba2bad3c5ffc7d91de92017f3c35e6d1ead7e4171759f3dcfe51422596718cc6cd60eec0e54cdcb1b04462f62d62f62b98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kk \
libreoffice-l10n-kk \
locale-libreoffice-kk"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
