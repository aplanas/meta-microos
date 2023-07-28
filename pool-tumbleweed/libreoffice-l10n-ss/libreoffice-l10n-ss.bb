SUMMARY = "Swati localization files for LibreOffice"
DESCRIPTION = "Provides Swati translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ss-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "e89e90e5940178ac3d686fadf11ddb064287c488eaf0b461063d96cd95af395220bc47e669d02ffa3c05326047d54cfe7bae99606668fc523b8a17144db4ffe9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ss \
libreoffice-l10n-ss \
locale-libreoffice-ss"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
