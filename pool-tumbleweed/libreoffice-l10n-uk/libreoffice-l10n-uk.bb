SUMMARY = "Ukrainian localization files for LibreOffice"
DESCRIPTION = "Provides Ukrainian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-uk-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "0fb79c152b14f22775e98620f972b90e74a5656cc902f42604742a7ca72a5dfd7d9d9358c89a55363065d0842dcbf58466d59082264fe998dab6d4aca37bd603"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-uk \
libreoffice-l10n-uk \
locale-libreoffice-uk"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-uk-UA"

inherit rpm
