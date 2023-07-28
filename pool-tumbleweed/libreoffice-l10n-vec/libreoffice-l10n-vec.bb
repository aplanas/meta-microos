SUMMARY = "Venetian localization files for LibreOffice"
DESCRIPTION = "Provides Venetian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-vec-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "7c1632019ac426174a15ec484d1674a1b27c9e65ce68d4adf46e1e4dc5b83d7f018b3d179461a46a46269299755587373438ce3c02847cf10fa0e82313064e42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-vec \
libreoffice-l10n-vec \
locale-libreoffice-vec"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
