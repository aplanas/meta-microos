SUMMARY = "Konkani localization files for LibreOffice"
DESCRIPTION = "Provides Konkani translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-kok-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "dac0006b47efbce49bd1dea78096a2de829dd418f072bea30bb4c59680e88204da1a93273c62fa7808a37a50bdd94135276925a7af56229a21442b2199c5549e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-kok \
libreoffice-l10n-kok \
locale-libreoffice-kok"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
