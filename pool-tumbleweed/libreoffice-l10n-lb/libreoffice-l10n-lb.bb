SUMMARY = "Luxembourgish localization files for LibreOffice"
DESCRIPTION = "Provides Luxembourgish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-lb-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "ef5ba465845cddbb43a9ba11e7f0988913f56401ace34518f2afb2cde089f6c96c460e0d0af3a83d2ac62a48303118524960d494294d0e6fc100d2671c4ae62b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lb \
libreoffice-l10n-lb \
locale-libreoffice-lb"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
