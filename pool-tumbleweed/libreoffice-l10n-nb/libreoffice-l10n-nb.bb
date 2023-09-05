SUMMARY = "Bokmal localization files for LibreOffice"
DESCRIPTION = "Provides Bokmal translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-nb-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "2dd38b3d0461f4a1653c82d1bd73779f8d604b7b09ba94567b0d93306b5c438d3692914f64cda1b5e479c3c0478b097c6c66dc73c08816e9bceb10774aa4aad7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nb \
libreoffice-l10n-nb \
locale-libreoffice-nb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-no"

inherit rpm
