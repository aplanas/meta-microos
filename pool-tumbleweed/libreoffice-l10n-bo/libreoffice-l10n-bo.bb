SUMMARY = "Tibetian localization files for LibreOffice"
DESCRIPTION = "Provides Tibetian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-bo-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "9d87b05284fbfafd41de89a3bc3708833cc7e1c4a221e3558f44d1f0b59d64ef9dc2a7d6934510e71ee4d154e6b2c724f455b319c1a2a916d8b140ff3d3cf8c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bo \
libreoffice-l10n-bo \
locale-libreoffice-bo"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-bo"

inherit rpm
