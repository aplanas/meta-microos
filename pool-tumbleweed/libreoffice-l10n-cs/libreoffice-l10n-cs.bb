SUMMARY = "Czech localization files for LibreOffice"
DESCRIPTION = "Provides Czech translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-cs-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "2d37cef32e6405a51eca625afb40f5ba0f997f2712f0995eec576680fb25e426b6bc084054ab36f0371432c583732a0944b2798e281d99f58000eaa71f200d0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-cs \
libreoffice-l10n-cs \
locale-libreoffice-cs"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-cs-CZ"

inherit rpm
