SUMMARY = "Uzbek localization files for LibreOffice"
DESCRIPTION = "Provides Uzbek translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-uz-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "01b6a174bade8fe3635000f126f6f47feb89234788dd7cf07171ec3e603284ef8c9c5749d1c91836c63447b63664900c696c0372165f13a70b4fd7d702e1a8fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-uz \
libreoffice-l10n-uz \
locale-libreoffice-uz"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
