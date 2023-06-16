SUMMARY = "English_GB localization files for LibreOffice"
DESCRIPTION = "Provides English_GB translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-en_GB-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "85d340e9ed870ba5b822ec068e6851aed428e14adfe3cd869d7f29e38a347f8b5c3d88683ec83fbb393f37caf5511d3b9e473cfcdc6d00c9d2ad1b41f48f9e53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-en-GB \
libreoffice-l10n-en-GB \
locale-libreoffice-en-GB"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-en-GB"

inherit rpm
