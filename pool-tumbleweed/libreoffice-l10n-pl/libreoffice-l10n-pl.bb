SUMMARY = "Polish localization files for LibreOffice"
DESCRIPTION = "Provides Polish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-pl-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "26e237b075f5f8477a128c28201141ef16bad1dfac723c67b27d10e66217004e47149d065969dca210d77d70651636e5e03d881418430f720822c726feaf46ef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pl \
libreoffice-l10n-pl \
locale-libreoffice-pl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-pl-PL"

inherit rpm
