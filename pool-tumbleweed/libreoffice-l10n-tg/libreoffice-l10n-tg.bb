SUMMARY = "Tajik localization files for LibreOffice"
DESCRIPTION = "Provides Tajik translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-tg-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "e0d7acf0ae218707a79c06f178009f31fe2ba2f1091b9ccdad0d2e75fd955d4147bd8740b1883ea0d22c2d2a5c04dcfb691a61da301a3da15b0403b45d25c258"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tg \
libreoffice-l10n-tg \
locale-libreoffice-tg"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
