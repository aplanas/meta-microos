SUMMARY = "Xhosa localization files for LibreOffice"
DESCRIPTION = "Provides Xhosa translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-xh-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "af620fad0877b5ab651b60ccaa0dfa87986523d2340d7a4cccdfb5fce1d00c0801136c20b68108b7a844361be47af0c2ec7e553a15f08301444f0cd64f9b6aa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-xh \
libreoffice-l10n-xh \
locale-libreoffice-xh"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
