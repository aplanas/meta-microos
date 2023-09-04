SUMMARY = "Xhosa localization files for LibreOffice"
DESCRIPTION = "Provides Xhosa translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-xh-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "5853fa28fc4d71b20f321fb9d3481fbd46cc6f76b3f929985dc77f7318e120b937406e461f3783fcb11cb7bd0e769afc0a338717af8b070ab0f4ccc8dae56938"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-xh \
libreoffice-l10n-xh \
locale-libreoffice-xh"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
