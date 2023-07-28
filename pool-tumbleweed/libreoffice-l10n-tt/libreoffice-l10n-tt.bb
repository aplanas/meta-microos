SUMMARY = "Tatar localization files for LibreOffice"
DESCRIPTION = "Provides Tatar translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-tt-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "1a2177a140ae1ffc576513c26801b619d56b7420c0e4909f416786e1640a1afd488a5cb1dff74f1493c318925cc5534c3b034be169fba679bb9bd8ffeec5567b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tt \
libreoffice-l10n-tt \
locale-libreoffice-tt"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
