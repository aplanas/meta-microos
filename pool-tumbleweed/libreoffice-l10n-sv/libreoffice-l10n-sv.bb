SUMMARY = "Swedish localization files for LibreOffice"
DESCRIPTION = "Provides Swedish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-sv-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "cd0f6f7f62aa3a63df42d28ea04fa35a66c4d94e645794e4370c9c090cd50ecf5dcf63c437ca79fe36c8592afd6380a2a3f703d09b99187234d4ecd031e1b5cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-sv \
libreoffice-l10n-sv \
locale-libreoffice-sv"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-sv-SE"

inherit rpm
