SUMMARY = "Sinhalese localization files for LibreOffice"
DESCRIPTION = "Provides Sinhalese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-si-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "abf48470b5662c07eaaac9508633ae4e255796ce143bfc172b572559a4e111b078ec90208b2183ebd1b8e7a7a7d9e21b4a4e407e46cfc482934d01f2f7124f82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-si \
libreoffice-l10n-si \
locale-libreoffice-si"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-si-LK"

inherit rpm
