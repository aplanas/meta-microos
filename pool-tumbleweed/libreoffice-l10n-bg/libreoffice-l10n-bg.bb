SUMMARY = "Bulgarian localization files for LibreOffice"
DESCRIPTION = "Provides Bulgarian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-bg-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "cd4a7f3e733b6aaa1842f65ddf220658f9b3d3e5feb8934eb90e8382df367abb0f9af423662733dc015ec7d275c4a2ddf0c6f5f2dfd7569c127d9ae2725dfea0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bg \
libreoffice-l10n-bg \
locale-libreoffice-bg"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-bg-BG"

inherit rpm
