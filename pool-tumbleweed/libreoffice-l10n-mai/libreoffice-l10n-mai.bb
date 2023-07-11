SUMMARY = "Maithili localization files for LibreOffice"
DESCRIPTION = "Provides Maithili translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-mai-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "74376dfbd6b3df59b17bf551d3efbe7a0fc45c672b8f9deb17f3f0a0662d1a211a6d89bf5663d2eec6e63893a399482a962fbb0d285ae9fc12dec0d7c5cc8899"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mai \
libreoffice-l10n-mai \
locale-libreoffice-mai"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
