SUMMARY = "Nynorsk localization files for LibreOffice"
DESCRIPTION = "Provides Nynorsk translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-nn-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "46fd68244972c3214c97988a62062a3945e08d1d4a68e842be9b82c308c734e1eb488b8e3f861eb64ed6f9e024327f5b9f953f703f30f375e5c9e6039fb60ce1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nn \
libreoffice-l10n-nn \
locale-libreoffice-nn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-nn-NO"

inherit rpm
