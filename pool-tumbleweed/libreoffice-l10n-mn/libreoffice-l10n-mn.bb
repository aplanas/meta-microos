SUMMARY = "Monglolian localization files for LibreOffice"
DESCRIPTION = "Provides Monglolian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-mn-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "631b5bac65d383e75ab0433d6286371ab3c2f8eb20a901b9490878faa65a8ceb6a4cc9c12bdc91be0e72504b6b15b23d452522ed4ad1b3e8e20fcee0ca2ce47a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mn \
libreoffice-l10n-mn \
locale-libreoffice-mn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
