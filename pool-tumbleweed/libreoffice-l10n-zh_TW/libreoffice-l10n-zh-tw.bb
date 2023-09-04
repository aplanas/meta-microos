SUMMARY = "Traditional_Chinese localization files for LibreOffice"
DESCRIPTION = "Provides Traditional_Chinese translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-zh_TW-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "8c05676960008fab6dac046621509d182078958a9e0a4bde3092c453c516b0b44d708e53f053dfef1582f2f8c7ddb378067b226c2cbd3e77a999fce7de13a527"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-zh-Hant \
libreoffice-help-zh-TW \
libreoffice-l10n-zh-Hant \
libreoffice-l10n-zh-TW \
locale-libreoffice-zh-TW"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
