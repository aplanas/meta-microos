SUMMARY = "Southern_Sotho localization files for LibreOffice"
DESCRIPTION = "Provides Southern_Sotho translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-st-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "db50c3f8839068d44996fcd3046da05203c1f07c2201bf3d667b6c1a98e7b8f5add4ceff3ed6ee785b02b4a108b1227bf2ab57950b82e15c1736b4ce01752785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-st \
libreoffice-l10n-st \
locale-libreoffice-st"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
