SUMMARY = "Bengali_India localization files for LibreOffice"
DESCRIPTION = "Provides Bengali_India translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-bn_IN-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "a414f0371e4c1561dc30f5c2d796b5e0ddfb6e3dab1a04985433143811039807d3fc4c6a95d1802f83e34a1dbfde90a5fd6148b65ff5b0b38b9426523e4346e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bn-IN \
libreoffice-l10n-bn-IN \
locale-libreoffice-bn-IN"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-bn-IN"

inherit rpm
