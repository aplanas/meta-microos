SUMMARY = "Romanian localization files for LibreOffice"
DESCRIPTION = "Provides Romanian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ro-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "831addfa6b874822065441d2f6b72d6abae78b78bf4f6b6bc155aa8eaab050b8807328a863ecbdda7dc9b0f81d16af5f0004c524cc6a3b50610bf396f862a999"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ro \
libreoffice-l10n-ro \
locale-libreoffice-ro"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ro"

inherit rpm
