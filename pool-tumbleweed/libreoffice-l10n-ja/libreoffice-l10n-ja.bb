SUMMARY = "Japanese localization files for LibreOffice"
DESCRIPTION = "Provides Japanese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-ja-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "9ecf8f5297fcee1adcedd79eb155e3e13a58dd7b4580bac48e408d3f61596ae6c7fe6bcddabdad4c2b2b7429aa60349ded30ee0084b2c408fd00b5efbb945ed3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ja \
libreoffice-l10n-ja \
locale-libreoffice-ja"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
