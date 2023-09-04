SUMMARY = "Welsh localization files for LibreOffice"
DESCRIPTION = "Provides Welsh translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-cy-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "e72e3f562ccd525e6aef6d20671e6ac51ba6c2ff902ab835781ed16220a61610088e5837d278ac69c8c86310c44ba877823a722607eefe2128380aa3e72bfb57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-cy \
libreoffice-l10n-cy \
locale-libreoffice-cy"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
