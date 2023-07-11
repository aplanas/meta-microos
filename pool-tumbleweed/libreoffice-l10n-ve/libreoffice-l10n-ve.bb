SUMMARY = "Venda localization files for LibreOffice"
DESCRIPTION = "Provides Venda translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ve-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "4c8c5097fbdba91297002f2d2af1646cfb9b3b5257c709996578cbc79d6aa04c552140790b709cb2158e7013e3943d76e1227908b4be0845e2b93b60b0db5f05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ve \
libreoffice-l10n-ve \
locale-libreoffice-ve"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
