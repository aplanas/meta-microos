SUMMARY = "Italian localization files for LibreOffice"
DESCRIPTION = "Provides Italian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-it-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "cfe08398834d92fc5d35ec54d743b4ba6b1934102fddb0fbfd29451cb91714fb2ef60801c692b419cbfa67b2c06255551a9c823939725e02037a383342962e60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-it \
libreoffice-l10n-it \
locale-libreoffice-it"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-it-IT"

inherit rpm
