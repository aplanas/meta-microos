SUMMARY = "Arabic localization files for LibreOffice"
DESCRIPTION = "Provides Arabic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-ar-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "4a6807f001ef50a58b4fa6dbf3fbb5bd551309902e35e3f40f5e9722680616d5ebe288a13d68bdeb125bf4a57c1c72794a86b1a3e2bd3b8855e5e8cdb807a636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ar \
libreoffice-l10n-ar \
locale-libreoffice-ar"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ar"

inherit rpm
