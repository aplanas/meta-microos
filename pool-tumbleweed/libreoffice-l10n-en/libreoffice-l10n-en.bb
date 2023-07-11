SUMMARY = "English localization files for LibreOffice"
DESCRIPTION = "Provides English translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-en-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "73d203af32d48f9c4d8d519f2d342051f9f035068ce9eef5a93e4e1d9fb15c2b9638ed4068527cc44e042589359dda91923dfe471b5773236ca149d121d1eb1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-en \
libreoffice-help-en-US \
libreoffice-l10n-en \
locale-libreoffice-en"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-en"

inherit rpm
