SUMMARY = "Tatar localization files for LibreOffice"
DESCRIPTION = "Provides Tatar translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-tt-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "f9d31d799b28f410945cd2d977ef130bddbc044472f38a4d1bbb76fc3d5b967879fcf20044a965aa13169fcdd30e691fc2e3577764abe8849eed145d777a7716"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tt \
libreoffice-l10n-tt \
locale-libreoffice-tt"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
