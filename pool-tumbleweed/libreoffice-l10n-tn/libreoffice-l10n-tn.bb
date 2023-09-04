SUMMARY = "Tswana localization files for LibreOffice"
DESCRIPTION = "Provides Tswana translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-tn-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "b9c09f5c444ac3bec1a222add49af8a61bf347dd29b3990469474e691a1d2082e5097d5e7ea37c0fecc99ca4846732820c2775f53afc0b8d9e482fa8ca436eb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tn \
libreoffice-l10n-tn \
locale-libreoffice-tn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
