SUMMARY = "Hindi localization files for LibreOffice"
DESCRIPTION = "Provides Hindi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-hi-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "03d87bc71016a2d366d76c881c5e5e493b3e68f6e7f2a5e4ebf2f44045a4aea4f1bb077b9eaa48db354bb9bda59ebea8d4611814d4a427c63908345d7ab7fa19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hi \
libreoffice-help-hi-IN \
libreoffice-l10n-hi \
libreoffice-l10n-hi-IN \
locale-libreoffice-hi"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-hi-IN"

inherit rpm
