SUMMARY = "Bosnian localization files for LibreOffice"
DESCRIPTION = "Provides Bosnian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-bs-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "213300a8479da3cffc72925f7c4c75110973f170bf3a72d80ea34cf9374445ddd63ebbb5b18d192b3ced1af79d925f2d607f16d04fc80616c7fc2bf2506991cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bs \
libreoffice-l10n-bs \
locale-libreoffice-bs"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
