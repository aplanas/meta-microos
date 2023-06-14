SUMMARY = "Bengali_India localization files for LibreOffice"
DESCRIPTION = "Provides Bengali_India translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-bn_IN-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "7bcaf1702366e06fa752eb64811d01083f052a3f2d3b34d706b8b6d19d72dda6c4bee0adde6864397b9e5daa7849fdf21cd319ecb42b485ae844b54f130adef1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bn-IN \
libreoffice-l10n-bn-IN \
locale-libreoffice-bn-IN"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-bn-IN"

inherit rpm
