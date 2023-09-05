SUMMARY = "Bengali localization files for LibreOffice"
DESCRIPTION = "Provides Bengali translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-bn-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "d9a0c8baa520db347fd944790a0fec57ce4e2e6594ff5a276173e000e131597ddd223ff4f8aa47036e4716c2647d051a9d52d242a9eb00d1509cabac437c6a69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-bn \
libreoffice-l10n-bn \
locale-libreoffice-bn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-bn-BD"

inherit rpm
