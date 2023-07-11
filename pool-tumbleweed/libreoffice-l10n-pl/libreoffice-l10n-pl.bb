SUMMARY = "Polish localization files for LibreOffice"
DESCRIPTION = "Provides Polish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-pl-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "8a9bb858255fabbdba6989f0ff773b06dbd0307299ad426082d41ab9ecd5eeeca238ad687e4330ba8c54680f97ee0619fe88ea096931e13d90fe3ae485b4f5ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pl \
libreoffice-l10n-pl \
locale-libreoffice-pl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-pl-PL"

inherit rpm
