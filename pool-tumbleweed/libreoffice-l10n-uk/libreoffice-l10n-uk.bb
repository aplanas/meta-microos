SUMMARY = "Ukrainian localization files for LibreOffice"
DESCRIPTION = "Provides Ukrainian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-uk-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "1cb1fffeb56caaf723234488fdf74a5b5685ed2d0258ca2e2c41d447f184fd38a8dcf15d1a5ae6649b7303ae4faecdc5dbac24477ce2d959b9ec9bf4899b5fad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-uk \
libreoffice-l10n-uk \
locale(libreoffice:uk)"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-uk_UA"

inherit rpm
