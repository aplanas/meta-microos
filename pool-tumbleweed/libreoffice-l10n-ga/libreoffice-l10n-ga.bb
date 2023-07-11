SUMMARY = "Irish localization files for LibreOffice"
DESCRIPTION = "Provides Irish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ga-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "6fe9d57719ccf8dad6f77a2291d6d34517f77af8ab34e60b8afe4ea2d5a699286f47a33171a1285757d426b181ef94493bd3fa5bde7ba4105db8f6e8c4fe7561"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ga \
libreoffice-l10n-ga \
locale-libreoffice-ga"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
