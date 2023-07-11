SUMMARY = "Uzbek localization files for LibreOffice"
DESCRIPTION = "Provides Uzbek translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-uz-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "05815ce0ed788ce42e6b98f30f29d8923113f33727e612bdf01e45dfcea426815e0903af54ef5c102b7cc937cedb6244c401a9521f88d05d29da702e0b00b67c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-uz \
libreoffice-l10n-uz \
locale-libreoffice-uz"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
