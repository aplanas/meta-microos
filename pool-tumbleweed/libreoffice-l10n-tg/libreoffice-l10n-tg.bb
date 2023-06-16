SUMMARY = "Tajik localization files for LibreOffice"
DESCRIPTION = "Provides Tajik translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-tg-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "2389f06e75d7cbfd3a45678f5bd0ab0aae7e7c0bdbced008bb68d2fb4f7e2ba5975713fe3ca39d5546205dfc5f1797c9be78b0386decd4d1d96022e959b46095"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tg \
libreoffice-l10n-tg \
locale-libreoffice-tg"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
