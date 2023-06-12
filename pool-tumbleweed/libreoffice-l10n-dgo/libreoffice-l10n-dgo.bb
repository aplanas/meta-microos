SUMMARY = "Dogri localization files for LibreOffice"
DESCRIPTION = "Provides Dogri translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-dgo-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "4d8d24c9d6427530a1489158292f6a78c17fd312e3f737a125f9a35ea01548f1da9473a8ed2d2779019979680d6ffe0e4bf304f7c16025ad971390f9b7edeb96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-dgo \
libreoffice-l10n-dgo \
locale(libreoffice:dgo)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
