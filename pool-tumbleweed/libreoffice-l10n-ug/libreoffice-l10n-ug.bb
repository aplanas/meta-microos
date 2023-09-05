SUMMARY = "Uyghur localization files for LibreOffice"
DESCRIPTION = "Provides Uyghur translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-ug-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "8c107700821ad986840630495e8d0de27e4a433920b679d2fd8386904d032173c03e5513c4cd035b1c6de69ead7dcfe40379809e9253446366a5c9ddd73ecfaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ug \
libreoffice-l10n-ug \
locale-libreoffice-ug"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
