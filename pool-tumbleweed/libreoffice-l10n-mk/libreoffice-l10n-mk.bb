SUMMARY = "Macedonian localization files for LibreOffice"
DESCRIPTION = "Provides Macedonian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-mk-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "638910ad5c28f51af9e942be2659f33c5a61711945a68b6b3ccd7b6f708df580ef5f21f68b25881320e1764c8995a122424a267c4df20ca690a9a0ded82bfe37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mk \
libreoffice-l10n-mk \
locale-libreoffice-mk"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
