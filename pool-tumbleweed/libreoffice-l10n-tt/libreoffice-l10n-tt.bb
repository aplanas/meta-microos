SUMMARY = "Tatar localization files for LibreOffice"
DESCRIPTION = "Provides Tatar translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-tt-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "13ddd442f8caac7c3296fc305453484289692cdf90084b6ccd450594cede0c0f6099dbc190026ca4381b87afc1af10bd0147e90a1c999c2c506a6014afa0b4e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tt \
libreoffice-l10n-tt \
locale-libreoffice-tt"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
