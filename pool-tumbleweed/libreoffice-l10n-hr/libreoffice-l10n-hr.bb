SUMMARY = "Croatian localization files for LibreOffice"
DESCRIPTION = "Provides Croatian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-hr-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "daf65547a85f103274256b3a62a642e52db242104b7b945830b4c8aa96f1aa42bbb6851ae7c84c6643ec0da914c51e7749b31f5f85ee88aa44c2b9cf22a2e4d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hr \
libreoffice-l10n-hr \
locale-libreoffice-hr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-hr-HR"

inherit rpm
