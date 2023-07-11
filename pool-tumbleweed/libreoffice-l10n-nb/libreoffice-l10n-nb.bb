SUMMARY = "Bokmal localization files for LibreOffice"
DESCRIPTION = "Provides Bokmal translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-nb-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "6f15c623bca4a122cf72e378fe284bccf04af3c1168d093511cb426f29d471ec19df0c2b391b84c6512b6e510b8c43522b4c010b444ff0e7e20b5a0e05c9d30c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nb \
libreoffice-l10n-nb \
locale-libreoffice-nb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-no"

inherit rpm
