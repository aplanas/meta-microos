SUMMARY = "Arabic localization files for LibreOffice"
DESCRIPTION = "Provides Arabic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-ar-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "07db66d1cddec35a79f35d154a54617f19b8f143c69c65a8b49a708075aa2db1bed8ce47ccc5c2deffcaf66a999fb2060b5f6336ebc180debf29589bb1cfa486"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ar \
libreoffice-l10n-ar \
locale-libreoffice-ar"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ar"

inherit rpm
