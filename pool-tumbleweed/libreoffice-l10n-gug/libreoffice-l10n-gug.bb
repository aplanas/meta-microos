SUMMARY = "Paraguayan_Guaraní localization files for LibreOffice"
DESCRIPTION = "Provides Paraguayan_Guaraní translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-gug-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "ad54f7a9bdf2711f8c882700d74ebba9a2ab7730662b7a92ab21caa4a8ffe699016ce84a5b3a10af72c8d4bb3e327b75b6952e0ad0de24410ef7c2ec2a386267"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gug \
libreoffice-l10n-gug \
locale-libreoffice-gug"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-gug"

inherit rpm
