SUMMARY = "Lao localization files for LibreOffice"
DESCRIPTION = "Provides Lao translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-lo-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "fb39122946ccb7e15dfcffd638c5bcbc9ac42db085a3b93fe0c45777a7cd7ede76ee6b66810341204273a07bc1a63cae6d2fb63ad5c2f11ca4effb27bb4bb9b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lo \
libreoffice-l10n-lo \
locale-libreoffice-lo"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-lo-LA"

inherit rpm
