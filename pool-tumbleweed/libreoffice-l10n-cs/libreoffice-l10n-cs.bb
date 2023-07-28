SUMMARY = "Czech localization files for LibreOffice"
DESCRIPTION = "Provides Czech translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-cs-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "c1ca3583a0912487af7d19ab587a46661ed1845e57a063bee1de268ea880360835d7278aa55223ca99afed08d8b11d7b8e69680f68a3c1aa265f8fef87f131ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-cs \
libreoffice-l10n-cs \
locale-libreoffice-cs"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-cs-CZ"

inherit rpm
