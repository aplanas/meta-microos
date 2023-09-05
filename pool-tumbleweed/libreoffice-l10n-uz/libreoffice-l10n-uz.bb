SUMMARY = "Uzbek localization files for LibreOffice"
DESCRIPTION = "Provides Uzbek translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-uz-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "659a14025947513df7c20a901517bc0cd168aa07edd6067c057ef5da12bc7282a19b622efbb28758f7018a20ba53b50160e29c3b4e4e7eb2f85b9e76d4489605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-uz \
libreoffice-l10n-uz \
locale-libreoffice-uz"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
