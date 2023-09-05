SUMMARY = "Sinhalese localization files for LibreOffice"
DESCRIPTION = "Provides Sinhalese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-si-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "fb7f01ff70a080cef0b95667f74d8ece324962a2342f418f62dc9d980d60a9a96b6b8a48a3817cc32595f0035f3f9bf829805cdebc3fe2115ae24c053dfee981"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-si \
libreoffice-l10n-si \
locale-libreoffice-si"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-si-LK"

inherit rpm
