SUMMARY = "Punjabi localization files for LibreOffice"
DESCRIPTION = "Provides Punjabi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-pa-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "feb0fa684fb724dd87150122cded167469c6d2aaaf184469e0353266bbcc2ef2bdedeecf3e64ba0d98fd50a417e9746872a533374997bc21f3a47c198aeb8b30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pa \
libreoffice-help-pa-IN \
libreoffice-l10n-pa \
libreoffice-l10n-pa-IN \
locale(libreoffice:pa)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
