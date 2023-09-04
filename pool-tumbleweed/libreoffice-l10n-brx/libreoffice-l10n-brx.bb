SUMMARY = "Bodo localization files for LibreOffice"
DESCRIPTION = "Provides Bodo translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-brx-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "45bd64e17e2723e9bbfb52c6862c3ecc7ef09aabbb4851a9d59f5c26132589b31832bf742e942bf8b579c3da75c351a07946bca2ff3ddcf51ac7fa61b2eeddc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-brx \
libreoffice-l10n-brx \
locale-libreoffice-brx"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
