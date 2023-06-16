SUMMARY = "Dutch localization files for LibreOffice"
DESCRIPTION = "Provides Dutch translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-nl-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "28261a099b79899434100685a1e3a73fa7c91218b9dc66f50df187cc62b370fcc56c9479676b033a8e2d922fb376b47f011ada43f53a5882d035e9e0ba9e59eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nl \
libreoffice-l10n-nl \
locale-libreoffice-nl"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-nl-NL"

inherit rpm
