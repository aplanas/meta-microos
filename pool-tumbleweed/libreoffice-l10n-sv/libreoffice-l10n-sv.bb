SUMMARY = "Swedish localization files for LibreOffice"
DESCRIPTION = "Provides Swedish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-sv-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "e5b8deb31795f4ecbe9bd3b13678992053163892bdf7d7bb41788f92adb0410ad33c8606df845be18f18672ee080b946eff576274bee5bfd4b6fb5c93b895081"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sv \
libreoffice-l10n-sv \
locale-libreoffice-sv"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sv-SE"

inherit rpm
