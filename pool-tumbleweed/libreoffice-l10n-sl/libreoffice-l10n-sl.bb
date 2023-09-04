SUMMARY = "Slovenian localization files for LibreOffice"
DESCRIPTION = "Provides Slovenian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-sl-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "d4a4f08c33da7d671232aa52563e1c4017dcbe1b08af23c0be4eb9d2b7f792fe3842a491e7b6e41d18a4df8d2a719ae702a1d33b5849a9191192ceb79b699314"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sl \
libreoffice-l10n-sl \
locale-libreoffice-sl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sl-SI"

inherit rpm
