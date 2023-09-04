SUMMARY = "Southern_Ndebele localization files for LibreOffice"
DESCRIPTION = "Provides Southern_Ndebele translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-nr-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "0223e67cb404d6ab83e45152a07a40ff487a5dedbeb7d197b6f5d105f928b706d0c97c1d77398e4a9ce5d36bc5713c11f0571eee51f83149c350da2cd651ddc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nr \
libreoffice-l10n-nr \
locale-libreoffice-nr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
