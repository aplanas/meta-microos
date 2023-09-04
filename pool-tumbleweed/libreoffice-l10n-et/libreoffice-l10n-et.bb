SUMMARY = "Estonian localization files for LibreOffice"
DESCRIPTION = "Provides Estonian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-et-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "754eb8304974ca77b452eafcb4ef2bf00ecb71098e852d9fc8f52f928bea817dfb014b3d8cce9bddf3fb80e3b426b22298ba37f176850f2222f74a6a79debbf5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-et \
libreoffice-l10n-et \
locale-libreoffice-et"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-et-EE"

inherit rpm
