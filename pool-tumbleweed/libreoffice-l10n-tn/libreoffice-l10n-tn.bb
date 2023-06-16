SUMMARY = "Tswana localization files for LibreOffice"
DESCRIPTION = "Provides Tswana translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.1"

RPM_NAME = "libreoffice-l10n-tn-7.5.4.1-1.1.noarch.rpm"
RPM_HASH = "125ff54891dafb2374be295302d5c9ee1daf78812c3fccce51f7e113f25866418fd924f9b60db3faceefd405f3f3b0f268ebae4e91efd2039b6d668418a71312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-tn \
libreoffice-l10n-tn \
locale-libreoffice-tn"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
