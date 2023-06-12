SUMMARY = "Lao localization files for LibreOffice"
DESCRIPTION = "Provides Lao translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-lo-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "b25e030b2f69c0a6c9058ce325f0dfab44c6a2110d6cc80ea3ec255fd8c0d04b0e4ceff81ac07397cd52db1b1e5ad2faa062635e3d3bbc6ed70ee2f57befb576"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lo \
libreoffice-l10n-lo \
locale(libreoffice:lo)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-lo_LA"

inherit rpm
