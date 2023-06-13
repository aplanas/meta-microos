SUMMARY = "Italian localization files for LibreOffice"
DESCRIPTION = "Provides Italian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-it-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "3ebfd3f3eb411e4a56713cd17cc3bb6043cf4955c0df48388a8e174208cbbb93dfb3f57be7c05351745e900d58a6bc3ecae996a040182eca469a714bd5b1d36a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-it \
libreoffice-l10n-it \
locale(libreoffice:it)"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-it_IT"

inherit rpm
