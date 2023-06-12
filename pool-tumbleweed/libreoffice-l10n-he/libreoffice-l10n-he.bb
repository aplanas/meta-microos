SUMMARY = "Hebrew localization files for LibreOffice"
DESCRIPTION = "Provides Hebrew translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-he-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "f203db1cde02ef7e703e02550bfebb028fa0ccd15ae5913d093a95e2761a91fbbb2275f62a3b76cba8d51aba4ac1552643b03407aab3cc4fd3e1520fa64747fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-he \
libreoffice-l10n-he \
locale(libreoffice:he)"
RDEPENDS:${PN} += "/bin/sh \
libreoffice \
libreoffice-share-linker \
myspell-he_IL"

inherit rpm
