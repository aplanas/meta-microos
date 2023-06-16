SUMMARY = "Venda localization files for LibreOffice"
DESCRIPTION = "Provides Venda translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-ve-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "1d5b069de3cd17cd139dc80c8482a2951dd2eeffb066d3d4a00e59fb14f34a7b5401b5a6f1548e8571ae865fbc5a644008438409d52f3c1d48fdb0429e0b4333"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ve \
libreoffice-l10n-ve \
locale-libreoffice-ve"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
