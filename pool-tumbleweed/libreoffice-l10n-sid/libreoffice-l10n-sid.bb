SUMMARY = "Sidamo localization files for LibreOffice"
DESCRIPTION = "Provides Sidamo translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-sid-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "2318c661a7f32cadf37d32d272a13a00f9699896483f47105d16385cb0c12da7953e22ede03a2474c78a561edb5224d7d0064bc5f474a684f530286e2f72232c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sid \
libreoffice-l10n-sid \
locale-libreoffice-sid"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
