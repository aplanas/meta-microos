SUMMARY = "Maithili localization files for LibreOffice"
DESCRIPTION = "Provides Maithili translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-mai-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "57c5d33374e162c4205917770fec5aee5765a888ddfe8f962f33fdb8c8233ee27187a9cfc9517728b50b1e1e88c16082ae4ddcb48e9d31303e72206de58c84e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mai \
libreoffice-l10n-mai \
locale-libreoffice-mai"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
