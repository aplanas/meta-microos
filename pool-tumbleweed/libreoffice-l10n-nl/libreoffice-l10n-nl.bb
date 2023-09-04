SUMMARY = "Dutch localization files for LibreOffice"
DESCRIPTION = "Provides Dutch translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-nl-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "47323a066809d53c64c127764ecc856e947c71670ee637b6cef981750fc29dcb2efa994f52666163a2d51c8e0eb3ac60004db2aebf1e66ff45ac5e0bc3888060"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nl \
libreoffice-l10n-nl \
locale-libreoffice-nl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-nl-NL"

inherit rpm
