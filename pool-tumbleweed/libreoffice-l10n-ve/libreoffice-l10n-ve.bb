SUMMARY = "Venda localization files for LibreOffice"
DESCRIPTION = "Provides Venda translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-ve-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "a470eb28f4d95867db869fb561d371353db421f543a8eaed9b7d1178da2451a2e2cd22b68547ed7bab0552edcf5b62bf89390634b7438094ce2de55f5b1a912e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ve \
libreoffice-l10n-ve \
locale-libreoffice-ve"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
