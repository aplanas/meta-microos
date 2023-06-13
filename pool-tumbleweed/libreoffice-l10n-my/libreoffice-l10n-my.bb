SUMMARY = "Burnese localization files for LibreOffice"
DESCRIPTION = "Provides Burnese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-my-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "c5a1e8a626d40cf116c5323163571b7376217f400ebc8bdd7ccf2817b7a8f69240f94b7cd10ae363f855f02882f6e6133e2d3222300997343f9adc2ccbb50fe1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-my \
libreoffice-l10n-my \
locale(libreoffice:my)"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
