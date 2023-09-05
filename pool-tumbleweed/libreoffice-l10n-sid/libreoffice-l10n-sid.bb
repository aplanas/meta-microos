SUMMARY = "Sidamo localization files for LibreOffice"
DESCRIPTION = "Provides Sidamo translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-sid-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "e8b8a38afac46ae4d394c54949991a272e5c4d77a78502eccd4f9aa94fef60ce13c3e3f64fb8ec35c24c4ec906067f2f5a59f0ae1e54c5c41389c333430bf9ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sid \
libreoffice-l10n-sid \
locale-libreoffice-sid"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
