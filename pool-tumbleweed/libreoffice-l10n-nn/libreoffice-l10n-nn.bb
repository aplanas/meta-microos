SUMMARY = "Nynorsk localization files for LibreOffice"
DESCRIPTION = "Provides Nynorsk translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-nn-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "fb72b2ea3649aecc0dc84ddb108d098cd0b4252480f03ff9a2bc0be49ac39490bab8621ca4ab5bda3793d82a83ff2105db0af57e15e29ef5a390a193d509c40f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-nn \
libreoffice-l10n-nn \
locale(libreoffice:nn)"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-nn_NO"

inherit rpm
