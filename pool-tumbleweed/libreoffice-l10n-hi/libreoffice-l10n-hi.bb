SUMMARY = "Hindi localization files for LibreOffice"
DESCRIPTION = "Provides Hindi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-hi-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "65ca6bc4e30859b06cedb4d611d842c8d070cb9a2d24fceb0dd19a79767b27124832f5e620eac818bdf2fdaf27d8e537fbeab56b9abc1f61e0b2d1e382c3d87f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hi \
libreoffice-help-hi-IN \
libreoffice-l10n-hi \
libreoffice-l10n-hi-IN \
locale-libreoffice-hi"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-hi-IN"

inherit rpm
