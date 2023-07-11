SUMMARY = "Catalan localization files for LibreOffice"
DESCRIPTION = "Provides Catalan translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-ca-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "8f359aeb30ad1a476b4f37b5619ff43ff8d59f39543eafccd680613db43462000cc1fd3957608e04d168b8f9742fea2b226fa8e0d71f75d7dc9e8a198d8a0d22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ca \
libreoffice-l10n-ca \
locale-libreoffice-ca"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-ca"

inherit rpm
