SUMMARY = "Lao localization files for LibreOffice"
DESCRIPTION = "Provides Lao translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-lo-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "dba20c6def4853736d2b525c79eeaf29eb4ecde530d2cc1f17e3e9d91f6b9dad42db6a64cd4e80fa6afd79caf32cc952b06b82447be2e196a0ba908d456b7069"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-lo \
libreoffice-l10n-lo \
locale-libreoffice-lo"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-lo-LA"

inherit rpm
