SUMMARY = "Finnish localization files for LibreOffice"
DESCRIPTION = "Provides Finnish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-fi-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "f58cd8a10bac26f0329fc0d4d4a481f062f0abb902becc1749ee6c3756479eddd9bb5f936d4f116a8e1b0de34aef22240a47600fd4506ceefc66921740d4074b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fi \
libreoffice-l10n-fi \
locale-libreoffice-fi"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
libreoffice-voikko"

inherit rpm
