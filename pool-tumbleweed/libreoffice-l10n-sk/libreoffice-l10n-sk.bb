SUMMARY = "Slovak localization files for LibreOffice"
DESCRIPTION = "Provides Slovak translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-sk-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "48146759e3ad770805cb4f9e36fc9f8108d20697cdaac736edf3af808e2b393c36366a62f9ece0af75b322316a17c8ce42fb999996464259b18e55089d5e8a61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sk \
libreoffice-l10n-sk \
locale-libreoffice-sk"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sk-SK"

inherit rpm
