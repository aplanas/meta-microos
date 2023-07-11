SUMMARY = "Punjabi localization files for LibreOffice"
DESCRIPTION = "Provides Punjabi translations and additional resources (help files, etc.) for LibreOffice."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "7.5.4.2"

RPM_NAME = "libreoffice-l10n-pa-7.5.4.2-1.3.noarch.rpm"
RPM_HASH = "f4e852048b3d16270dbbd40b693c712d200dfb39723c0c02cb88a41a430c8abbe8ede912e97861b45a976f6e14ed27c83a2bd6b3505cf197f1ebc16cbf08b487"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-help-pa \
libreoffice-help-pa-IN \
libreoffice-l10n-pa \
libreoffice-l10n-pa-IN \
locale-libreoffice-pa"

RDEPENDS:${PN} += "/usr/bin/sh \
libreoffice \
libreoffice-share-linker"

inherit rpm
