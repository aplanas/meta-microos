SUMMARY = "Asturian localization files for LibreOffice"
DESCRIPTION = "Provides Asturian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ast-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "a90d986549c40b19fb3dd8ea9f621d305742ebfa9b286cb1d895afac70f6d9522f5a61f67435facb3d959f3245f6763ea62eb2f5ea1fc7674bacc6b615180f57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ast \
libreoffice-l10n-ast \
locale-libreoffice-ast"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
