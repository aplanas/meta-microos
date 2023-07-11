SUMMARY = "Santali localization files for LibreOffice"
DESCRIPTION = "Provides Santali translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-sat-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "c237a4cef0ed30ee621275f72981833b7569a9747243715a7fa0a6712448ee4748a9801981839baefdbdcbe46c966c9edba174b96eb7085052c34172d9c1824c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sat \
libreoffice-l10n-sat \
locale-libreoffice-sat"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
