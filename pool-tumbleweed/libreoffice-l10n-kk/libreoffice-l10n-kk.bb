SUMMARY = "Kazakh localization files for LibreOffice"
DESCRIPTION = "Provides Kazakh translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-kk-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "848fb0375ee3ee10b6ddee53f7aada7ca4c17cdb7777f987efde2d68199dd0249468faefbfa326bfd7bd362eba83851b733cd86cd17d7784f4744711cd69945c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kk \
libreoffice-l10n-kk \
locale-libreoffice-kk"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
