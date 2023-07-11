SUMMARY = "Czech localization files for LibreOffice"
DESCRIPTION = "Provides Czech translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-cs-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "1153a5ebea1c2caa769e2e445eff33e5f04d6779ef208ea9ffb761c7ead60d0257a66b25936aab30c4d7e06ae90b0bcd709557c23bab0010ebd0512e48545505"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-cs \
libreoffice-l10n-cs \
locale-libreoffice-cs"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-cs-CZ"

inherit rpm
