SUMMARY = "Gaelic localization files for LibreOffice"
DESCRIPTION = "Provides Gaelic translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-gd-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "a4095aa5aa006a0e23cb1502ff02ded4694b868a63a37d749f85abd64a7dca85f7872346907f481c5b11a12b4549bb0146f498db2c166cf9e75cb1895482d7f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-gd \
libreoffice-l10n-gd \
locale(libreoffice:gd)"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-gd_GB"

inherit rpm
