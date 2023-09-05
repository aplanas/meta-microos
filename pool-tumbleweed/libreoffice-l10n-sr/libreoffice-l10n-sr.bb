SUMMARY = "Serbian localization files for LibreOffice"
DESCRIPTION = "Provides Serbian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-sr-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "f8a014415c2c054663e3c662cd2871449eeaa9379f1dc29056ec7f956ee0730b4a15cd6161cd016ddfa6d7dfa06eb9bbe7e6053674c5b3295b2242f34ee0913b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sr \
libreoffice-l10n-sr \
locale-libreoffice-sr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sr"

inherit rpm
