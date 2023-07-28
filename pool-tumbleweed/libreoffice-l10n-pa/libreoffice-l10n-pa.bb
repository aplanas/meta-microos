SUMMARY = "Punjabi localization files for LibreOffice"
DESCRIPTION = "Provides Punjabi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-pa-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "fc734480a8f4878cc65c020487dfa44b3e149054205b6a2f7edfe9e9166e59d1dd05e491803d8032d6cd9266b51bd319bc2598e42ddce870524995e7ec7db821"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pa \
libreoffice-help-pa-IN \
libreoffice-l10n-pa \
libreoffice-l10n-pa-IN \
locale-libreoffice-pa"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
