SUMMARY = "Swati localization files for LibreOffice"
DESCRIPTION = "Provides Swati translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.1.1"

RPM_NAME = "libreoffice-l10n-ss-7.6.1.1-1.1.noarch.rpm"
RPM_HASH = "d06835efe0c854fa7b9d1cf38728cd53de71db2971a8c61fe1d302356139f0991cdb7b568d0bab707ff26e19a235c0924ddef5afb1d1e4d4fca3b81a89ba04f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-ss \
libreoffice-l10n-ss \
locale-libreoffice-ss"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
