SUMMARY = "Croatian localization files for LibreOffice"
DESCRIPTION = "Provides Croatian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-hr-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "406affc915693774861e67ea94de71a9bc0a51a548600194f48a11969e44bc9493bea7b7f9a3a1a2c3452d49528b4b0580df6d1af40a4ae11bb3715d548af445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hr \
libreoffice-l10n-hr \
locale-libreoffice-hr"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-hr-HR"

inherit rpm
