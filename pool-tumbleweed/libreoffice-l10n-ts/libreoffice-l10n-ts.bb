SUMMARY = "Tsonga localization files for LibreOffice"
DESCRIPTION = "Provides Tsonga translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ts-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "066480b7650a81b8e25dffdfb24cf5da02c2f711c43ac4aeff79a7e415741f1a9288cdf62995b77c65f185b2ed41d0d4d6bb7d10279701941db73ae546826bdb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ts \
libreoffice-l10n-ts \
locale-libreoffice-ts"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
