SUMMARY = "Croatian localization files for LibreOffice"
DESCRIPTION = "Provides Croatian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-hr-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "ffe3f32cb94ee09ab6f00d0691a2578aa586aaa7e85de33831c6d7200a51f1559766b2c81b3f188c7894724518fae88d35e0d908f59e91bd5ed8c976d5491fb1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hr \
libreoffice-l10n-hr \
locale-libreoffice-hr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-hr-HR"

inherit rpm
