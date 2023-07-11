SUMMARY = "Indonesian localization files for LibreOffice"
DESCRIPTION = "Provides Indonesian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-id-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "40a3d10685329f823607858ae5b8ec981f8af905055ea0dfb73337efb078b0ea98b6fe8ed6177d5fc077216c71d82af24653abd2728b262e23cdb830893ec35f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-id \
libreoffice-l10n-id \
locale-libreoffice-id"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-id"

inherit rpm
