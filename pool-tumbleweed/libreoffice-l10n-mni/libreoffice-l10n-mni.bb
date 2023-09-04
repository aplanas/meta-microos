SUMMARY = "Manipuri localization files for LibreOffice"
DESCRIPTION = "Provides Manipuri translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.6.0.3"

RPM_NAME = "libreoffice-l10n-mni-7.6.0.3-1.1.noarch.rpm"
RPM_HASH = "4445a0e3b432208fe4fad7b8964e2e0a9d9b99adf224b86d0cdf91d46c9112a4ba99e758c35bafe60fa39eb23fe34deb4529d0a7a6b39c5068dc18727d6a32ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mni \
libreoffice-l10n-mni \
locale-libreoffice-mni"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
