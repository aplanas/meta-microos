SUMMARY = "Traditional_Chinese localization files for LibreOffice"
DESCRIPTION = "Provides Traditional_Chinese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-zh_TW-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "74d42ca62b884382bab76e6d719961d1d2dda609ae7f1f2cad14c738f4f86cdc56c304308d99446512f137facc905eee907655e6ffa410f094dd00e8ca193d1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-zh-Hant \
libreoffice-help-zh-TW \
libreoffice-l10n-zh-Hant \
libreoffice-l10n-zh-TW \
locale-libreoffice-zh-TW"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
