SUMMARY = "Bengali_India localization files for LibreOffice"
DESCRIPTION = "Provides Bengali_India translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-bn_IN-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "0261f48ba8b2779d69b241a89671ec39869c6e007e841e10e5e4e3a1be673edc9803df67f26f2aa71e4c800c0c054ea4d8e7b0263ae086dcf0eadbb857ed55ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bn-IN \
libreoffice-l10n-bn-IN \
locale-libreoffice-bn-IN"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-bn-IN"

inherit rpm
