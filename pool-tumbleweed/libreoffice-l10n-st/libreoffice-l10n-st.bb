SUMMARY = "Southern_Sotho localization files for LibreOffice"
DESCRIPTION = "Provides Southern_Sotho translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-st-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "af9291b9780f4eecc57068d2365490a82591fa755c0f533a6d910a45e773da891de3c8c7126c87f5597d79f239da8b3290009b876963a922060e685866763c95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-st \
libreoffice-l10n-st \
locale-libreoffice-st"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
