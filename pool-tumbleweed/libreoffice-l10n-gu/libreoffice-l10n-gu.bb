SUMMARY = "Gujarati localization files for LibreOffice"
DESCRIPTION = "Provides Gujarati translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-gu-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "3e1296f52a9c675653d656503183a7efc0c81703a47b3e783bbed08180f80f3af40d6976f82d6a67f7b54d6ef650ab6021035b5c76402ab923a6d64bf365b4b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gu \
libreoffice-help-gu-IN \
libreoffice-l10n-gu \
libreoffice-l10n-gu-IN \
locale-libreoffice-gu"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-gu-IN"

inherit rpm
