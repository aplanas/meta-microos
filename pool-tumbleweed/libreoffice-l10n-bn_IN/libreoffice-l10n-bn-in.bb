SUMMARY = "Bengali_India localization files for LibreOffice"
DESCRIPTION = "Provides Bengali_India translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-bn_IN-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "3b01b5dcf5256b5b78219b0b8b908a89c788c413808302f4f022860895e27070f28a9b4cbeb243df006136e0e3be355136d1ebd4e628fa54292f076398b5ffd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bn-IN \
libreoffice-l10n-bn-IN \
locale-libreoffice-bn-IN"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-bn-IN"

inherit rpm
