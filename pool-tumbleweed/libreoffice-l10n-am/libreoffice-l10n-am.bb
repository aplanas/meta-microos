SUMMARY = "Amharic localization files for LibreOffice"
DESCRIPTION = "Provides Amharic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-am-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "9d7209949305e66dae011611a89d699d0577c70b5018cee592e655c54816060a9472bf08b915cabc0a88dcb3bb136cf2cdea609a04d421b5eb55285caceb9335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-am \
libreoffice-l10n-am \
locale-libreoffice-am"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
