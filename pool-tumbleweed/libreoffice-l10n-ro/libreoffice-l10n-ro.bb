SUMMARY = "Romanian localization files for LibreOffice"
DESCRIPTION = "Provides Romanian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ro-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "e9f08a5f4d5be08407bbfdefb034003016726aa92573072558b90c1300b11b1e89fb6ff6a5b4e5e260872582d5b14d3faca2ada4d18a1ac5c35cb40912db889c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ro \
libreoffice-l10n-ro \
locale-libreoffice-ro"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ro"

inherit rpm
