SUMMARY = "Gujarati localization files for LibreOffice"
DESCRIPTION = "Provides Gujarati translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-gu-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "78415ec29cbd088803bcb268cebcdc0a6e719ccda079e6d01fd5a0d584d0459740a0004925ab555f6afd84cf9b2646c2ce60b878f69c27bff3e0bbc42d74cfac"
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
