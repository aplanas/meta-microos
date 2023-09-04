SUMMARY = "Asturian localization files for LibreOffice"
DESCRIPTION = "Provides Asturian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-ast-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "b4643411f13df062f60a89512f6c04e6d81520d6bfd0b79d5c4644261dc2e6d7fca1e68aeaa61281878d69bb71a39d1b722e40b8c2a31e19185c7e2a4b4839ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ast \
libreoffice-l10n-ast \
locale-libreoffice-ast"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
