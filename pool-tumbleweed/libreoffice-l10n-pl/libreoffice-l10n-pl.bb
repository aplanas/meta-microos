SUMMARY = "Polish localization files for LibreOffice"
DESCRIPTION = "Provides Polish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-pl-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "a8fc47cc220a1433140913f148603757fc44b25b30cf32c09bab8322a0e8795ffce3f23a8a79cc4b06dcb0b7f35df67d16306691f53f2b4c1e9b4b9f8978b73d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pl \
libreoffice-l10n-pl \
locale-libreoffice-pl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-pl-PL"

inherit rpm
