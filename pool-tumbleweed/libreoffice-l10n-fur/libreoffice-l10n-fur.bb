SUMMARY = "Friulian localization files for LibreOffice"
DESCRIPTION = "Provides Friulian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-fur-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "bcc01104fbc3a9305732ff225da3d236241ac7f1d1734d44e1963b5e5e94d78e71d61cb19f702e993a667ac1b0590044b387638b03e2ef4b9b956820d6fbebf2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-fur \
libreoffice-l10n-fur \
locale-libreoffice-fur"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
