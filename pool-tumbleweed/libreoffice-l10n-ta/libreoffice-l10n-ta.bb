SUMMARY = "Tamil localization files for LibreOffice"
DESCRIPTION = "Provides Tamil translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-ta-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "e154db410b6052e2686aa0f3d0637870ae251563d64a0230f88a2225b309973a293c49eb02ad41bf640429afb90bfd3190565d483cce9449ba29b8b10a31c28c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ta \
libreoffice-l10n-ta \
locale-libreoffice-ta"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
