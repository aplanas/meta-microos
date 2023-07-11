SUMMARY = "Sinhalese localization files for LibreOffice"
DESCRIPTION = "Provides Sinhalese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-si-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "901058e7b153d862622641fe3542244f34fbb370d258a1e073db0015446541a362f4df3f13678da324b3ec84f59be622b3a5c9a6712f85e157571a49aa30e32e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-si \
libreoffice-l10n-si \
locale-libreoffice-si"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-si-LK"

inherit rpm
