SUMMARY = "Greek localization files for LibreOffice"
DESCRIPTION = "Provides Greek translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-el-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "f4b955a75a6e101cd366dc8a6f1e5779fc3e6b23096f286acae4e77ffcff9af20f6623528fc9611145ba87a45120010dca28234c9d29e6f68f0bd753727406bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-el \
libreoffice-l10n-el \
locale(libreoffice:el)"

RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-el_GR"

inherit rpm
