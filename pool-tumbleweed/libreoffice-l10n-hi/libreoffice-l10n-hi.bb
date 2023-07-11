SUMMARY = "Hindi localization files for LibreOffice"
DESCRIPTION = "Provides Hindi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-hi-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "ed9ded290afad60539844d8d6f8ac420179c5b3f2acb46162d061fbedc09092fd8051cbbc7dcef8eeaa91b00839c24232c903e6fc67d78e0b5c11ac1a5e0071e"
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
