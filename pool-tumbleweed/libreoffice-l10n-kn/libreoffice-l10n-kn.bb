SUMMARY = "Kannada localization files for LibreOffice"
DESCRIPTION = "Provides Kannada translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-kn-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "afed2b432bcb85187f73e82f21f90318f7a4d245fb690b858ce4ca7ebf1cfdeabfa8c9f5f6abe73038fbf40e7f58ad4b91502845ca1b6d28d6514a5abce2e3c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kn \
libreoffice-l10n-kn \
locale-libreoffice-kn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
