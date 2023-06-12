SUMMARY = "Georgian localization files for LibreOffice"
DESCRIPTION = "Provides Georgian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-ka-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "f2577069a213292d386e324fedb057350e962c1bff4d9d0b331f57f2b79c6ced8231327464e986ad287d27b2097bf781e760ef5b731e46988193cec206ae7a30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ka \
libreoffice-l10n-ka \
locale(libreoffice:ka)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
