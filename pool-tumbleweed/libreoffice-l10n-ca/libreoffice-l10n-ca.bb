SUMMARY = "Catalan localization files for LibreOffice"
DESCRIPTION = "Provides Catalan translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-ca-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "896cbb8b78d6c4c799cd2182796a0f5e501304acc6009fc6cb366ab10014e8e8c60c74d2d3532a80fe1b264d288a2bdca7c6ad40b035663c8b14e50598b923c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ca \
libreoffice-l10n-ca \
locale-libreoffice-ca"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ca"

inherit rpm
