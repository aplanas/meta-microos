SUMMARY = "Italian localization files for LibreOffice"
DESCRIPTION = "Provides Italian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-it-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "06d5281af544c695590ae61b5c12eb64bc349347d8e88012e6c145bb460446c7df17f802dcd1dccec1fd0698af5349cf822e2c545c18501c57fa50f8759b4327"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-it \
libreoffice-l10n-it \
locale-libreoffice-it"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-it-IT"

inherit rpm
