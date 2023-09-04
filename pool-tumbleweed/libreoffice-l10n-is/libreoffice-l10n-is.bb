SUMMARY = "Icelandic localization files for LibreOffice"
DESCRIPTION = "Provides Icelandic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-is-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "576c8df5add0c1225696dac0c0d847dca6754a5207152c4cde7ad78842fd9321b27e3cc44df5ee5dbbaf131fad24be0d6112336911e1403d48868ba3e5ad6384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-is \
libreoffice-l10n-is \
locale-libreoffice-is"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-is"

inherit rpm
