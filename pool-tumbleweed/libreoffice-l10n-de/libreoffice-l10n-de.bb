SUMMARY = "German localization files for LibreOffice"
DESCRIPTION = "Provides German translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-de-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "50b4531a1fc5c9759954ae94415e9e47b602aaa7b2ead358058f5027686d151e24ecd85a70bf14d339a5e65683b6725cc952245fb3ecfedd777cfb2c92f11b03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-de \
libreoffice-l10n-de \
locale-libreoffice-de"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-de"

inherit rpm
