SUMMARY = "Russian localization files for LibreOffice"
DESCRIPTION = "Provides Russian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ru-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "7c61d0dc370ee1c1c0e37b27acdefe91855a911b1c5c5c8f687e82afbc6c85badf801d1fe36fc0034a858549134b05d04a85d0dd6f889f961b09e61336f54fba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ru \
libreoffice-l10n-ru \
locale-libreoffice-ru"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ru-RU"

inherit rpm
