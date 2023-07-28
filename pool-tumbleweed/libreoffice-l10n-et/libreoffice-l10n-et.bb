SUMMARY = "Estonian localization files for LibreOffice"
DESCRIPTION = "Provides Estonian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-et-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "8619adc9533b52f7e3abe0bfe79e688915bc917596c89b7c550e5b430df81cec675908beb21ec5a526f13ed3311caf0b1f948b08c91488b1465b4443340f1b33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-et \
libreoffice-l10n-et \
locale-libreoffice-et"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-et-EE"

inherit rpm
