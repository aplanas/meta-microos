SUMMARY = "Tswana localization files for LibreOffice"
DESCRIPTION = "Provides Tswana translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-tn-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "fa12ba54b1a747783ce3e00babf61d1b57b5251390679c27fcb6f4167aacaa4d908dccb738c8da4ecc316fc6ae5b28b569ed2bff4d6c944e4a6a1a797eb33e9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tn \
libreoffice-l10n-tn \
locale-libreoffice-tn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
