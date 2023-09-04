SUMMARY = "Danish localization files for LibreOffice"
DESCRIPTION = "Provides Danish translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-da-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "f8a5a8ce54af75469ed365fe4fd23427e926c2569c6689d645b09af5679a044858e8f42cabdcbf905d6068d47a4c7fb2b1aac2c2b26a6d31267ed6a2afc156a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-da \
libreoffice-l10n-da \
locale-libreoffice-da"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-da-DK"

inherit rpm
