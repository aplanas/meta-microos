SUMMARY = "Croatian localization files for LibreOffice"
DESCRIPTION = "Provides Croatian translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-hr-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "35fb89b7c3e9fb695ac42c019742f0d8c79b5d5c0ef17e25d1ab4882fa53c7cf2922d2ac9d529df1ccd1984e66cbcbda171ba440117be6fb3a7ac03a0fddb564"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-hr \
libreoffice-l10n-hr \
locale-libreoffice-hr"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-hr-HR"

inherit rpm
