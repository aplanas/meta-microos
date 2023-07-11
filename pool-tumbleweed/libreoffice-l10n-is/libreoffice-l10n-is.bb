SUMMARY = "Icelandic localization files for LibreOffice"
DESCRIPTION = "Provides Icelandic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-is-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "ba2eb41b001fdf6e3b65c05562036fa3c5afc780544dd24d4b00acb7d0f9685d12041063874d8f3e4a597b8a2f9d364531d89209a2389e804f31f60728742a26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-is \
libreoffice-l10n-is \
locale-libreoffice-is"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-is"

inherit rpm
