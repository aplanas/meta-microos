SUMMARY = "Belarusian localization files for LibreOffice"
DESCRIPTION = "Provides Belarusian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-be-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "4e489a5dde36444c0a6b3d5f129fb4c0c164a022a15121ec0bc46c35d0e971cdb70375454151ab820874249d774565f6fa0042f0ad7a8e287403e703b3c0ed36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-be \
libreoffice-l10n-be \
locale-libreoffice-be"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-be-BY"

inherit rpm
