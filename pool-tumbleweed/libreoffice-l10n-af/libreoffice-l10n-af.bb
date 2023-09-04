SUMMARY = "Afrikaans localization files for LibreOffice"
DESCRIPTION = "Provides Afrikaans translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-af-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "03d0cac24e706664fcde34fbf83c0e37da6746258e3ef83dd69cc7d188e8047c11553e37cbef527c50d58494ea1db72b933908c23985c1e175ef993181977a42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-af \
libreoffice-l10n-af \
locale-libreoffice-af"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-af-ZA"

inherit rpm
