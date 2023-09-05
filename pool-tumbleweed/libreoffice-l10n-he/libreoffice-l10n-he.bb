SUMMARY = "Hebrew localization files for LibreOffice"
DESCRIPTION = "Provides Hebrew translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-he-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "7bc9273c35026ca44acc0e8dbcc013d13f347d4a7d57893876aed05f9bb02421a540d30a2037bb76aeed908c62d10024be93d73ac169d45dca856e0ead78ec01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-he \
libreoffice-l10n-he \
locale-libreoffice-he"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-he-IL"

inherit rpm
