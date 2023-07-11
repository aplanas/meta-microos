SUMMARY = "Manipuri localization files for LibreOffice"
DESCRIPTION = "Provides Manipuri translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-mni-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "b5352ad81700a9b0c90ded7ea74929f2034b8f6338c2af734e7d2352c0cf3da943ec2eb29fdb91cdad1ad7e1a53df90a0d56cd8ab5b01384b1ddf654c6b06b7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-mni \
libreoffice-l10n-mni \
locale-libreoffice-mni"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
