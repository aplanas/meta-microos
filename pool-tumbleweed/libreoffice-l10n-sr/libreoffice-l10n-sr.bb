SUMMARY = "Serbian localization files for LibreOffice"
DESCRIPTION = "Provides Serbian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-sr-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "d7d9444b805d70a26be48fcd2a3522f543ecbd2bd848d13d21eed3f417a6598e884e5258d189bb81c7c177517fa5a9c45835b3547476f9ece65a523e33f8769f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sr \
libreoffice-l10n-sr \
locale-libreoffice-sr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sr"

inherit rpm
