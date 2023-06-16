SUMMARY = "Basque localization files for LibreOffice"
DESCRIPTION = "Provides Basque translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-eu-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "3e6b2ff6abe80df51506ef551e72f78b88e224afb919cf454b54edb9a3ca09eeff06e6eeafe7b9ac29152be56f316de4a67bb467a71d87c62e0cff0ccd2efbbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-eu \
libreoffice-l10n-eu \
locale-libreoffice-eu"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
