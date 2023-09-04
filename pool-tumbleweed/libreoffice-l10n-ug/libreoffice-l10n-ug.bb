SUMMARY = "Uyghur localization files for LibreOffice"
DESCRIPTION = "Provides Uyghur translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-ug-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "1f221c645e91e5be7734a9dccd8b064162bd8801727a8dfc0978ed8be75e0e2dbe83297dec4d2574a51c218e27fb6c52a5ed69db67f4fbfc2e48036af872f961"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ug \
libreoffice-l10n-ug \
locale-libreoffice-ug"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
