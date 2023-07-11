SUMMARY = "Lithuanian localization files for LibreOffice"
DESCRIPTION = "Provides Lithuanian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-lt-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "f2d6eb5039f28f6daca2ed50a3ecd39f6bf4f0431aeb8ddd1f54f417ef148cc97eb09032a1b3fc56d04b27f63f6565b5228a046d5fda7a2b026cbb83de571f4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lt \
libreoffice-l10n-lt \
locale-libreoffice-lt"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-lt-LT"

inherit rpm
