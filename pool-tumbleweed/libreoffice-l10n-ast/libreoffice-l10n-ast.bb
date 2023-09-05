SUMMARY = "Asturian localization files for LibreOffice"
DESCRIPTION = "Provides Asturian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-ast-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "7fadff14a85e74d3a7e06a9a72ac21dae416e91394f4f82f22382e6bc89ff82a2f94c588a5908687e3fb46f5ffd6eb983272448ebebd09f10fa48b5e4f9d2320"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ast \
libreoffice-l10n-ast \
locale-libreoffice-ast"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
