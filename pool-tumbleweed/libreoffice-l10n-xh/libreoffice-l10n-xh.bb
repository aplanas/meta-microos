SUMMARY = "Xhosa localization files for LibreOffice"
DESCRIPTION = "Provides Xhosa translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-xh-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "3382c4647d5c1c998b42683fa61de7c913b6e9481d296842c890c52a1166f6b6f34a98b13ad436f2d326bc5fea685d260146efffa116912786c4feb048b80b8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-xh \
libreoffice-l10n-xh \
locale-libreoffice-xh"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
