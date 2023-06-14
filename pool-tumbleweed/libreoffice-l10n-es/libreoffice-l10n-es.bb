SUMMARY = "Spanish localization files for LibreOffice"
DESCRIPTION = "Provides Spanish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-es-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "814509db73441f4c2c54a545b123f4ac2e6c010d43e278a7e6c36e49aea92cfcedfed3f1bfbbb9b5bb41f220f2f7ab92d8a3a22a748f8d3a887ff3899febd305"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-es \
libreoffice-l10n-es \
locale-libreoffice-es"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-es"

inherit rpm
