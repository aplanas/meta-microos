SUMMARY = "Tswana localization files for LibreOffice"
DESCRIPTION = "Provides Tswana translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-tn-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "471dcc1fb005e91e5beb43815033f60dc62f803659a155f8c9e7ce2bd68d720f099a9db1a624dee559daa2224030775a63db846f0c9d6a8c6d43b94c555f1ffe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tn \
libreoffice-l10n-tn \
locale-libreoffice-tn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
