SUMMARY = "Kinyarwanda localization files for LibreOffice"
DESCRIPTION = "Provides Kinyarwanda translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-rw-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "fdc20c51ab6bd2270b02e4e29f51ef6c382ac67cdfab793ada639e55624fe6ef3d93b99a45c91fa889ae002edba18c65f5bbbf5eecafa967e3648ab93ee12552"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-rw \
libreoffice-l10n-rw \
locale-libreoffice-rw"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
