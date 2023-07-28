SUMMARY = "Basque localization files for LibreOffice"
DESCRIPTION = "Provides Basque translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-eu-7.5.4.2-1.5.noarch.rpm"
RPM_HASH = "24485b171a539ec3563eefa4484b12908366c092d1ffea76e606a034076c9876d8a4893e45dc5947734b1a73ff581c61d70a7876799d5f7e92b85f00a2077747"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-eu \
libreoffice-l10n-eu \
locale-libreoffice-eu"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
