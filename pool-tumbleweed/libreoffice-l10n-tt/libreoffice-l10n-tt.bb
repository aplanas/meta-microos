SUMMARY = "Tatar localization files for LibreOffice"
DESCRIPTION = "Provides Tatar translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-tt-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "38380634c7f78d255e5596508b549190cedd3e2a869d803ea3f41b7f7b00ef406a52a507f4de8c2f70925ba8d5fe4d7f709681ca1509c67518e3b9d63d7ea809"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tt \
libreoffice-l10n-tt \
locale-libreoffice-tt"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
