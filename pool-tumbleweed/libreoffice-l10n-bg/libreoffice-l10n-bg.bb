SUMMARY = "Bulgarian localization files for LibreOffice"
DESCRIPTION = "Provides Bulgarian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-bg-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "423339efb07d39777658aca9b128ca5db149d31a396ee9e53f08f06fa92255928f343625003a00f344921a4f21ed2ee819305e6ed2c2ebafd3cc41048eceb22f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bg \
libreoffice-l10n-bg \
locale-libreoffice-bg"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-bg-BG"

inherit rpm
