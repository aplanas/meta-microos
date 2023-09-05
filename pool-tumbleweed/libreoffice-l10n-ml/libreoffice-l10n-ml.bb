SUMMARY = "Malayalam localization files for LibreOffice"
DESCRIPTION = "Provides Malayalam translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-ml-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "f8f19943854ffe8c9c091074d312a73f6ea6f99e8044de8b0fef3c10b68ee1ef3016db360dbf85f15f19d2cbeb2170be59daaa54c1dd0028aef70abc52899d49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ml \
libreoffice-l10n-ml \
locale-libreoffice-ml"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
