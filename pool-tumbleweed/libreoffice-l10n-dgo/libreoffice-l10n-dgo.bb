SUMMARY = "Dogri localization files for LibreOffice"
DESCRIPTION = "Provides Dogri translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-dgo-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "a0ec29980b9dd9ce9a32fe52910c887daa6026819cf322235acd0705ac2183a44e18e9bd69e61e1c352c198f3e07367d511ad9c8e86b394d18bdfa31964f194b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-dgo \
libreoffice-l10n-dgo \
locale-libreoffice-dgo"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
