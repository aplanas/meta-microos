SUMMARY = "Gaelic localization files for LibreOffice"
DESCRIPTION = "Provides Gaelic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-gd-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "a4b5e5bc41fbce7b85db957ba5a71041d7b0b4acb060672160aec0ca74327242903f87d29b4160833dc6cc03b14e80642d5bf744a148577d93854886cb75d8f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gd \
libreoffice-l10n-gd \
locale-libreoffice-gd"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-gd-GB"

inherit rpm
