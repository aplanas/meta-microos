SUMMARY = "English_ZA localization files for LibreOffice"
DESCRIPTION = "Provides English_ZA translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-en_ZA-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "9c8138a9cef4022a627b16e276df3a73fb7266b3c968bfb02148952315dca69d77d77c0953b2a6f75eca085a60e33e288e520078c9bcbc03318d1eefacbc31e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-en-ZA \
libreoffice-l10n-en-ZA \
locale-libreoffice-en-ZA"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-en-ZA"

inherit rpm
