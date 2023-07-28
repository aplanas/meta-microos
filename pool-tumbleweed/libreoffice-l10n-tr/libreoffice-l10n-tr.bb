SUMMARY = "Turkish localization files for LibreOffice"
DESCRIPTION = "Provides Turkish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-tr-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "8ec2548c27825ee375fe7c7d9ccda416569fdef6fb2320716bab4a3ca7e8047ccbf4928d8b828c572ffba8b518196517e65cc32e9481c832082cd7da6bdbd3e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tr \
libreoffice-l10n-tr \
locale-libreoffice-tr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-tr-TR"

inherit rpm
