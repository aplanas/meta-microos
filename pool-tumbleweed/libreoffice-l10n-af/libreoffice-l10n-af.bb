SUMMARY = "Afrikaans localization files for LibreOffice"
DESCRIPTION = "Provides Afrikaans translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-af-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "7b230d31cad9b34e73239e8fa4357aab69b90e83594b58828db69ef6a1b64a8578e8ab398a9713e37a32f2893eb8dfbb6318d93117f7d8490eda9e9bb6fb038b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-af \
libreoffice-l10n-af \
locale-libreoffice-af"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-af-ZA"

inherit rpm
