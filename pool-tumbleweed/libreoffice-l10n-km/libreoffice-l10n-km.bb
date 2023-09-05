SUMMARY = "Khmer localization files for LibreOffice"
DESCRIPTION = "Provides Khmer translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-km-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "5864b45323366f6182a7574612c251229ade718b61e9ee2957fa4dee00754c51d3130202a07ed52708ff37194e6232f10aaaa878e4d53b0454344b073229cbd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-km \
libreoffice-l10n-km \
locale-libreoffice-km"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
