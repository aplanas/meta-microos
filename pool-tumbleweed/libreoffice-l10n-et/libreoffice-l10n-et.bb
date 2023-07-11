SUMMARY = "Estonian localization files for LibreOffice"
DESCRIPTION = "Provides Estonian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-et-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "bd8a75daf9098c152b5cd0844b912217797f59764644aeb0cd10916ff8b419cf0f44dac839b0b4e6785a786cb42e83af40cd2a5336a96562294986404a207216"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-et \
libreoffice-l10n-et \
locale-libreoffice-et"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-et-EE"

inherit rpm
