SUMMARY = "Albanian localization files for LibreOffice"
DESCRIPTION = "Provides Albanian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-sq-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "29b1fa73820fdb91e9a30c258d4badd9de8fd903b38fb78fdc3b7fafbe58775f1c33a8e13a46d2b9ae87069ddc21b0083b9741ef901e7cee173784a67aceda47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sq \
libreoffice-l10n-sq \
locale-libreoffice-sq"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sq-AL"

inherit rpm
