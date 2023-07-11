SUMMARY = "English_GB localization files for LibreOffice"
DESCRIPTION = "Provides English_GB translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-en_GB-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "8085178ca3b691424de709a1f6d39b8a799e76c94881b308fdbd2b9d879052ed371240dd1f8186591636c4f39a048e891391a7ef131d7afbdc49ce95c357e606"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-en-GB \
libreoffice-l10n-en-GB \
locale-libreoffice-en-GB"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-en-GB"

inherit rpm
