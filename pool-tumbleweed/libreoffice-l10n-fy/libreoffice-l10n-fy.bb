SUMMARY = "Frisian localization files for LibreOffice"
DESCRIPTION = "Provides Frisian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-fy-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "9ecabc5028ffbe3d216e8cb097727712eb84bf7d0903d362395549ccf6494f043dff2f537eb5a7b38aa8d1022fd77982374113c0b51583fc9be9eae79d4833cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fy \
libreoffice-l10n-fy \
locale-libreoffice-fy"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
