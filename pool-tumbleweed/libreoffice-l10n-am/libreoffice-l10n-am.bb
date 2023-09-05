SUMMARY = "Amharic localization files for LibreOffice"
DESCRIPTION = "Provides Amharic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-am-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "60e9acc4a8483e105dbd4e600fc89cb0844eba0b3d12669a95793522059a7b68996cae4d86e2c4f4d1527121ad4fe56e186647a1c1e2f234308d99395f819f33"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-am \
libreoffice-l10n-am \
locale-libreoffice-am"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
