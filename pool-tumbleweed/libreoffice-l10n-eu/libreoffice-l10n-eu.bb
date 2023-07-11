SUMMARY = "Basque localization files for LibreOffice"
DESCRIPTION = "Provides Basque translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-eu-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "020b2e9010b974257ea7120f81fe62e70db3ec0296f9e11f15c6f81f1823fdd49ba1ab7ae0d704cc7ad9f6d227faf488acecf66c5ed1c855ab965fbae68e0d34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-eu \
libreoffice-l10n-eu \
locale-libreoffice-eu"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
