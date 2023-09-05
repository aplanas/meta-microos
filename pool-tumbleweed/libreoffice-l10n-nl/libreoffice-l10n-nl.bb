SUMMARY = "Dutch localization files for LibreOffice"
DESCRIPTION = "Provides Dutch translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-nl-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "eb579cad445b52868bb8954b9bd0b7a6a1bf9a78ce56280a357fb0987fdf1a1ae31c51cc548b4652f48cd0426a13b27734001a74f29081849f6b1c784e187eef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nl \
libreoffice-l10n-nl \
locale-libreoffice-nl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-nl-NL"

inherit rpm
