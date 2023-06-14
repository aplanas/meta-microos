SUMMARY = "Irish localization files for LibreOffice"
DESCRIPTION = "Provides Irish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-ga-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "4494e1895c737a436a65a36b83835f6af3ba163ae22285ccb2c886a03d94c98c2025fb1cbd0779e5f4456d441e78397d1060a888cc187037164747e3135e53af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ga \
libreoffice-l10n-ga \
locale-libreoffice-ga"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
